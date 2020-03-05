package ru.itsjava.project;

import java.util.Scanner;

public class MyProject {
    public static void main(String[] args) {
        String[] items = new String[]{"Окунь", "Рыба-Лось", "Лосось", "Треска"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.println("Введите номер меню:");
            int numMenu = scanner.nextInt();

            if (numMenu == 1) {
                printItems(items);
            } else if (numMenu == 2) {
                items = addItem(scanner, items);
            } else if (numMenu == 3) {
                items = deleteItem(scanner, items);
            } else if (numMenu == 4) {
                editItem(scanner, items);
            } else if (numMenu == 5) {
                sortItems(items);
            } else if (numMenu == 0) {
                System.out.println("Спасибо, что воспользовались нашим магазином.");
                break;
            }
        }

    }

    private static void editItem(Scanner scanner, String[] items) {
        System.out.println("Введите название рыбки, которую хотите поменять");
        String fish = scanner.next();
        System.out.println();
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(fish)){
                System.out.println("Введите новое имя рыбки:");
                items[i] = scanner.next();
                System.out.println();
                break;
            }
        }
    }

    private static void sortItems(String[] items) {
        String temp;
        for (int j = 0; j < items.length; j++) {
            for (int i = 0; i < items.length - 1 - j; i++) {
                if (items[i].charAt(0) > items[i + 1].charAt(0)) {
                    temp = items[i + 1];
                    items[i + 1] = items[i];
                    items[i] = temp;
                }
            }
        }
    }

    private static String[] deleteItem(Scanner scanner, String[] items) {
        System.out.println("Введите рыбину:");
        String fish = scanner.next();
        System.out.println();
        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if (fish.equals(items[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return items;
        }
        String[] resArray = new String[items.length - 1];
        for (int i = 0; i < index; i++) {
            resArray[i] = items[i];
        }

        for (int i = index; i < resArray.length; i++) {
            resArray[i] = items[i + 1];
        }
        return resArray;
    }

    private static String[] addItem(Scanner scanner, String[] fishes) {
        System.out.println("Введите рыбину:");
        String fish = scanner.next();
        System.out.println();
        String[] resultFishes = new String[fishes.length + 1];
        for (int i = 0; i < fishes.length; i++) {
            resultFishes[i] = fishes[i];
        }
        resultFishes[fishes.length] = fish;
        return resultFishes;
    }

    private static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Вывести список всех рыбок на экран\n" +
                "2. Добавить рыбку\n" +
                "3. Съесть рыбку\n" +
                "4. Изменить рыбку\n" +
                "5. Отсортировать рыбки\n" +
                "6. \n" +
                "7.\n" +
                "8.\n" +
                "0. Выход из нашего чудесного магазина рыбок!");
    }

    public static void printItems(String[] items) {
        System.out.print("Товары нашего магазина: ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
//Меню:
//1. Вывести список товаров на экран
//2. Добавить товар
//3. Удалить товар
//4. Изменить товар
//5. Отсортировать товары
//6.
//7.
//8.
//0. Выход

//HW:  1. съесть рыбу
//     2.Реализовывать 6, 7, и 8.