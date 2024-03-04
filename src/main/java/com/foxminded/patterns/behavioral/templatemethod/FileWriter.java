package com.foxminded.patterns.behavioral.templatemethod;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class FileWriter {

        protected StringBuilder content;

        public void writeCurrentDate() {
                if (this.content == null) {
                        this.content = new StringBuilder();
                }
                content.append(LocalDate.now()).append('\n');
        }

        public void writeCurrentTime() {
                if (this.content == null) {
                        this.content = new StringBuilder();
                }
                content.append(LocalTime.now()).append('\n');
        }

        public abstract void writeToFile();

        public String getOutput() {
                return this.content.toString();
        }
}
