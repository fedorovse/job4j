package ru.job4j.oop;

public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("Class Animal");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("Class Animal " + name);
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
