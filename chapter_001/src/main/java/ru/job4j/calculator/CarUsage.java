package ru.job4j.calculator;

import java.util.concurrent.Callable;

public class CarUsage {
    public static void main(String[] args) {
        Car lada = new Car();
        boolean result = lada.canDrive();
        System.out.println(" Можно ехать? " + result);
        System.out.println("I need gas ");
        int gas = 10;
        lada.fill(gas);
        result = lada.canDrive();
        System.out.println(" Можно ехать? " + result);
        int kilometr = 50;
        lada.drive(kilometr);
        lada.gasInfo();
    }
}
