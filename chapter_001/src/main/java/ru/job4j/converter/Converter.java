package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro (int value) {
        return value / 70;
    }

    public static int rubleToDollar (int value) {
        return value / 60;
    }

    public static int euroToRuble (int value) {
        return value * 70;
    }

    public static int dollarToRuble (int value) {
        return value * 60;
    }

    public static void main (String[] args) {
        int euro = rubleToEuro(140);
        System.out.println(" 140 Rubles are " + euro + " euro ");

        int dollar = rubleToDollar(120);
        System.out.println(" 120 Rubles are " + dollar + " dollars ");

        int rublesInDollars = dollarToRuble(20);
        System.out.println(" 20 Dollars are " + rublesInDollars + " rubles");

        int rublesInEuro = euroToRuble(20);
        System.out.println(" 20 Euro are " + rublesInEuro + " rubles");

        System.out.println(" ");
        System.out.println(" TEST ");

        int in = 210;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(" 210 rubles are 3 euro. Test result: " + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(" 180 rubles are 3 dollars. Test result: " + passed);

        in = 10;
        expected = 700;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println(" 10 euro are 700 rubles. Test result: " + passed);

        in = 10;
        expected = 600;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println(" 10 dollars are 600 rubles. Test result: " + passed);

    }
}
