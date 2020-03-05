package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Это строка";
        System.out.println("str = " + str);
        System.out.println("Число: " + 5);
        System.out.println("str.length() = " + str.length());
        System.out.println("str.charAt(1) = " + str.charAt(1));

        String str2 = "Это строка";

        System.out.println("str.equals(str2) = " + str.equals(str2));

        char c = '\u0123';
        System.out.println('c' +5);
    }
}
