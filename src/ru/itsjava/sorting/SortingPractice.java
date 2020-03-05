package ru.itsjava.sorting;

import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int[] array = new int[]{0, -1, 5, 8, 9, 3};
        System.out.println("Before: " + Arrays.toString(array));
        int temp;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("After: " + Arrays.toString(array));
    }
}
//HW: 1. Поменять местами значения переменных без использования дополнительной.
//    2. Релизовать алгоритм сортировки сложностью O(nlogn)
