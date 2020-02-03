package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println(" Bi - bi ");
    }

    @Override
    public void passenger(int number) {
        System.out.println("Passengers :" + number);
    }

    @Override
    public void fillUp(int liter, double money) {
        System.out.println("Liters :" + liter + " money : " + money);
    }
}
