package com.foxminded.patterns.behavioral.templatemethod;

public class FileWriterHelloWorld extends FileWriter {
        @Override
        public void writeToFile() {
                this.content.append("Hello world!");
        }
}
