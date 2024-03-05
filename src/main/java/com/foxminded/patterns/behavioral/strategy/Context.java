package com.foxminded.patterns.behavioral.strategy;

import java.util.List;

public class Context {

        private List<Integer> numbers;
        private ContextSort sort;

        public Context(List<Integer> numbers) {
                this.numbers = numbers;
        }

        public void sort() {
                if (sort != null) {
                        this.sort.sort(numbers);
                } else {
                        System.out.println("Can't sort. You'd choose an sort method");
                }


        }

        public List<Integer> getNumbers() {
                return numbers;
        }

        public void setNumbers(List<Integer> numbers) {
                this.numbers = numbers;
        }

        public void setSort(ContextSort sort) {
                this.sort = sort;
        }
}
