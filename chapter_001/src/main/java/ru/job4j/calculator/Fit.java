package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100D) * 1.15D;
    }

    public static double womanWeight(double height) {
        return  (height - 110D) * 1.15D;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        System.out.println(" Man 180 is " + man  + " kg ");

        double woman = womanWeight(150);
        System.out.println(" Woman 150 is " + woman + " kg ");
    }
 }
