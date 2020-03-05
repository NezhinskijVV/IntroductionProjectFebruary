package ru.itsjava.methods;

import java.util.Arrays;

public class MethodsPractice {

    public static void main(String[] args) {

        int[] numsArray = new int[]{7, 0, 3, 5};
//        for (int i = 0; i < numsArray.length; i++) {
//            System.out.print(numsArray[i] + " ");
//        }
        printArray(numsArray);
        System.out.println();

        int[] numsArray2 = new int[]{4, 3};
//        for (int i = 0; i < numsArray2.length; i++) {
//            System.out.print(numsArray2[i] + " ");
//        }
        printArray(numsArray2);
        System.out.println("maxValue(3,2) = " + maxValue(3, 2));
        System.out.println("maxValue(4,5) = " + maxValue(4, 5));
        System.out.println("maxValue(4,4) = " + maxValue(4, 4));

        System.out.println("minValue(3,2) = " + minValue(3, 2));
        System.out.println("minValue(4,5) = " + minValue(4, 5));
        System.out.println("minValue(4,4) = " + minValue(4, 4));

        int num = 4;
        num = incNum(num);
        System.out.println("num = " + num);

        changeFirstValueInArray(numsArray);
        printArray(numsArray);
        print();
    }

    private static void print() {
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int maxValue(int num1, int num2) {
//        if (num1 > num2) {
//            return num1;
//        }
//        return num2;
        //тернарный оператор(сокращенная форма оператора if)
        return num1 > num2 ? num1 : num2;
    }

    public static int minValue(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }

    public static int incNum(int num2) {
        return num2 + 1;
    }

    public static int[] changeFirstValueInArray(int[] array){
        int[] array2 = Arrays.copyOf(array,2);


        return new int[]{7};
//        array[0] = 5;
    }
}