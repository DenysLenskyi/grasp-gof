package com.foxminded.patterns.behavioral.templatemethod;

public class Main {
        public static void main(String[] args) {
                FileWriter file1 = new FileWriterHelloWorld();
                file1.writeCurrentDate();
                file1.writeCurrentTime();
                file1.writeToFile();
                System.out.println(file1.getOutput());
                System.out.println();
                FileWriter file2 = new FileWriterWorldHello();
                file2.writeCurrentDate();
                file2.writeCurrentTime();
                file2.writeToFile();
                System.out.println(file2.getOutput());
        }
}
