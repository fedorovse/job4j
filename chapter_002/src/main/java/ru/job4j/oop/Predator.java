package ru.job4j.oop;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Class Predator");
    }

    public Predator(String name) {
        super(name);
        System.out.println("Class Predator");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
