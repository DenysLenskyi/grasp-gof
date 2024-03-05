package com.foxminded.patterns.behavioral.strategy;

import java.util.List;

public class BubbleSort implements ContextSort {

        @Override
        public void sort(List<Integer> list) {
                int i;
                int j;
                int temp;
                boolean swapped;
                int n = list.size();
                for (i = 0; i < n - 1; i++) {
                        swapped = false;
                        for (j = 0; j < n - i - 1; j++) {
                                if (list.get(j) > list.get(j + 1)) {
                                        temp = list.get(j);
                                        list.set(j, list.get(j + 1));
                                        list.set(j + 1, temp);
                                        swapped = true;
                                }
                        }
                        if (swapped == false) break;
                }
                System.out.println("Bubble sorted");
        }
}
