package ru.itsjava.arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {
        int[] numArray = new int[]{2, -1, 4, 0, 3, 5, -6};
        //ctrl + alt + l форматирование
        System.out.println("Исходный массив: " + Arrays.toString(numArray));
        //Задание: вывести элементы больше нуля
        System.out.println("Задание: вывести элементы больше нуля");
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0) {
                System.out.print(numArray[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Задание: вывести элементы меньше нуля");
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < 0) {
                System.out.print(numArray[i] + " ");
            }
        }

        //Задание: вывести элементы, стоящие на индексах, которые кратны 3.
        System.out.println("Задание: вывести элементы, стоящие на идексах, которые кратны 3.");
        for (int i = 0; i < numArray.length; i++) {
            //ваш код
            if (i % 3 == 0) {
                System.out.print(numArray[i] + " ");
            }
        }

        //Задача: Посчитать сумму всех элементов массива
        System.out.println("Задача: Посчитать сумму всех элементов массива");
        int summa = numArray[0];
        int i;
        for (i = 1; i < numArray.length; i++) {
            summa += numArray[i];
        }
        System.out.println("Сумма элементов массива: " + summa);

        //Задача: Найти максимальный элемент массива
        int max = numArray[0];
        for (int j = 1; j < numArray.length; j++) {
            if (numArray[j] > max) {
                max = numArray[j];
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}

// 1. Вывести элементы большие нуля в обратном порядке
// 2. Вывести индексы элементов равных нулю
// 3. Произведение всех элементов массива
// 4. Найти среднеарифметическое массива
// 5. Найти сумму элементов с четными индексами
// 6. Произведение элементов с нечетными индексами
// 7. Найти минимальный элемент массива
// 8. Найти сумму отрицательных элементов массива
// 9. Найти элементы делящиеся на 5.
//10. Реализовать свою задачу.
//10* Найти 2 максимальных элемента массива, элементы не повторяются
//10** Найти 2 максимальных элемента массив, но элементы могут повторяться