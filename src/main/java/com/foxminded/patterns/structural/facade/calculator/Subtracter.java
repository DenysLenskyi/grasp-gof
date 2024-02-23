package com.foxminded.patterns.structural.facade.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;

public class Subtracter {

  public int subtract(int a, int b) {
    int result = 0;
    HttpURLConnection conn = null;
    OutputStream outputStream = null;
    BufferedReader br = null;
    try {
      // URL of the SOAP web service
      URL url = new URL("http://www.dneonline.com/calculator.asmx");

      // Open connection
      conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
      conn.setRequestProperty("SOAPAction", "http://tempuri.org/Subtract");
      conn.setDoOutput(true);

      // SOAP request body
      String xmlInput =
          "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
              + "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
              + "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" "
              + "xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
              + "  <soap:Body>\n"
              + "    <Subtract xmlns=\"http://tempuri.org/\">\n"
              + "      <intA>"
              + a
              + "</intA>\n"
              + "      <intB>"
              + b
              + "</intB>\n"
              + "    </Subtract>\n"
              + "  </soap:Body>\n"
              + "</soap:Envelope>";

      // Write SOAP request body to the connection
      outputStream = conn.getOutputStream();
      outputStream.write(xmlInput.getBytes());
      outputStream.flush();

      // Check if the response code is HTTP_OK
      if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
      }

      // Read the response
      br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
      StringBuilder output = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null) {
        output.append(line);
      }

      String SOAPResponse = output.toString();

      // Parse the SOAP response
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      Document doc =
          factory
              .newDocumentBuilder()
              .parse(new java.io.ByteArrayInputStream(SOAPResponse.getBytes()));

      // Create XPath expression to select the AddResult value
      XPathFactory xPathfactory = XPathFactory.newInstance();
      XPath xpath = xPathfactory.newXPath();
      XPathExpression expr = xpath.compile("//SubtractResult/text()");

      // Evaluate the XPath expression against the document
      String addResult = (String) expr.evaluate(doc, XPathConstants.STRING);

      result = Integer.parseInt(addResult);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      conn.disconnect();
      try {
        outputStream.close();
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return result;
  }
}
