package ru.itsjava.oop;

public class Lion {  //класс
    private String name; //поля класса
    private double weight;

    public Lion() {   //конструктор
    }

    public Lion(String name) { //конструктор
        this.name = name;
    }

    public void sayMeow() {   //метод
        System.out.println(name + " RRRRR");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void kingIsBack(){
        System.out.println("King is Back!");
    }
}