package ru.itsjava.arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] temperature = new int[]{1, 3, -7, 0, 5};
        System.out.println("temperature[1] = " + temperature[1]);
        System.out.println("temperature[temperature.length - 1] = "
                + temperature[temperature.length - 1]);

        System.out.println("Цикл while");
        int index = 0;
        while (index != temperature.length) {
            System.out.print("index " + index + ": " +
                    temperature[index] + " ");
            index++;
        }
        System.out.println();
        System.out.println("Цикл for");
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("index " + i + ": " +
                    temperature[i] + " ");
        }

        //Задача 1: Создать массив из 7 элементов и заполнить его от 1 до 7
        System.out.println();
        System.out.println("Arrays.toString(temperature) = " + Arrays.toString(temperature));

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
        //Задача 2: Вывести все элементы массива в обратном порядке
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Задача 3: Вывести элементы с четными индексами
        //Задача 4: Вывести элементы с нечетными индексами
        //Задача 5: Вывести первые 4 элемента
        //Задача 6: Вывести последние 4 элемента
    }
}