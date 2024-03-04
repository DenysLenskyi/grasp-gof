package com.foxminded.patterns.behavioral.templatemethod;

public class FileWriterWorldHello extends FileWriter {
        @Override
        public void writeToFile() {
                this.content.append("World hello!");
        }
}
