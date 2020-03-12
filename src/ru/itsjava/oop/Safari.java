package ru.itsjava.oop;

public class Safari {
    public static void main(String[] args) {
        Lion mufasa = new Lion("Муфаса");
//        mufasa.setName("Муфаса");
        mufasa.sayMeow();

        String name = "Simba";
        Lion simba = new Lion(name);
        simba.sayMeow();
        System.out.println("Имя Симбы: " + simba.getName());
        simba.setName("Король Симба");
        System.out.println("Имя Симбы: " + simba.getName());
        simba.kingIsBack();
    }
}

//Boar
// Поля: имя, вес, цвет, возраст
// Конструкторы: все поля, (имя, возраст, цвет)
// Методы: set и get для всех полей