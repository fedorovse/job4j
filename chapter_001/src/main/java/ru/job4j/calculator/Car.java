package ru.job4j.calculator;

public class Car {
    private double volume;

    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
    }

    public void fill(int gas) {
        this.volume = this.volume + gas * 8;
    }

    public boolean canDrive() {
        boolean result = this.volume > 0;
        return result;
    }

    public void gasInfo() {
        System.out.println("Запас хода " + this.volume);
    }
}
