package com.foxminded.patterns.behavioral.strategy;

import java.util.List;

public class QuickSort implements ContextSort {

        @Override
        public void sort(List<Integer> list) {
                int low = 0;
                int high = list.size() - 1;
                quickSort(list, low, high);
                System.out.println("Quick sorted");
        }

        private void quickSort(List<Integer> list, int low, int high) {
                if (low < high) {

                        int pi = partition(list, low, high);

                        quickSort(list, low, pi - 1);
                        quickSort(list, pi + 1, high);
                }
        }

        private int partition(List<Integer> list, int low, int high) {

                int pivot = list.get(high);

                int i = (low - 1);

                for (int j = low; j <= high - 1; j++) {

                        if (list.get(j) < pivot) {

                                i++;
                                swap(list, i, j);
                        }
                }
                swap(list, i + 1, high);
                return (i + 1);
        }

        private void swap(List<Integer> list, int i, int j) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
        }
}
