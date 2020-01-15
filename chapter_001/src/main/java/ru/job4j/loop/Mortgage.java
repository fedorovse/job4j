package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double amountBalance = amount;
        if ((amountBalance + amountBalance / 100 * percent) - salary > amountBalance) {
            year = 0;
        } else {
            while (amountBalance > 0) {
                amountBalance = (amountBalance + amountBalance / 100 * percent) - salary;
                year++;
            }
        }
        return year;
    }
}