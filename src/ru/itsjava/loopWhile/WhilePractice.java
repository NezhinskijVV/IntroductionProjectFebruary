package ru.itsjava.loopWhile;

public class WhilePractice {
    public static void main(String[] args) {
        //Задание: Вывести с помощью цикла while: "1 2 3 4 5"
        int i = 1;
        while (i < 6) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //Задание: Вывести с помощью цикла while: "5 4 3 2 1"
        while (i > 1) {
            System.out.print((i - 1) + " ");
            i--;
        }
        System.out.println();

        //Задача: Посчитать сумму чисел от 1 до 5
        int summa = 0;
//        i = 1;
        while (i <= 5){
            summa = summa + i;
            i++;
        }
        System.out.println("Сумма от 1 до 5: " + summa);

        //Задача: Вывести 10 раз: "Я люблю Java!"



        //Задача: Найти сумму цифр числа. 545  -> (5 + 4 + 5 =) 14


        //Задача: Вывести все делители числа  15 -> 15, 5, 3, 1


    }
}
