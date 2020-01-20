package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int level) {
        this.load = level;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery energizer = new Battery(50);
        Battery duracell = new Battery(30);
        System.out.println("energizer charge level: " + energizer.load + " duracell charge level: " + duracell.load);
        duracell.exchange(energizer);
        System.out.println("energizer charge level: " + energizer.load + " duracell charge level: " + duracell.load);
    }
}
