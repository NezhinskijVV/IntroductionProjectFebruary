package ru.itsjava.recursion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RecursionPractice {

    public static void main(String[] args) {
//        System.out.println("factorial(5) = " + factorial(5));
//        int[] array = new int[]{1, 2, 5, 10, 12, 17, 37, 49};
//        System.out.println("Index of 12 = " +
//                binarySearch(12, 0, array.length, array));
//        Set set = new HashSet<>();
        Double d1 = 5.0;
        double d2 = 5.0f;
        Float f1 = (float) 5.0;
        float d = 5.0f;
        HashMap hashMap = new HashMap();
    }

    private static int binarySearch(int num, int start, int end, int[] array) {
        int mid = (start + end) / 2;
        if (array[mid] == num) {
            return mid;
        } else if (array[mid] < num) {
            return binarySearch(num, mid + 1, end, array);
        }
        return binarySearch(num, start, mid - 1, array);
    }

    public static int factorial(int num) {
        if ((num == 1) || (num == 0)) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}