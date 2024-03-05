package com.foxminded.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<Integer> ints = new ArrayList<>();
                ints.add(10);
                ints.add(19);
                ints.add(17);
                ints.add(18);
                ints.add(13);
                ints.add(114);
                ints.add(11);
                List<Integer> ints2 = new ArrayList<>(ints);
                Context context = new Context(ints);
                System.out.println("Unsorted");
                printList(context.getNumbers());
                System.out.println();
                context.setSort(new BubbleSort());
                context.sort();
                printList(context.getNumbers());
                System.out.println();
                context = new Context(ints2);
                System.out.println("Unsorted");
                printList(context.getNumbers());
                System.out.println();
                context.setSort(new QuickSort());
                context.sort();
                printList(context.getNumbers());
        }

        private static void printList(List<Integer> list) {
                list.forEach(e -> System.out.print(e + " "));
        }
}
