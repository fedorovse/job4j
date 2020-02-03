package ru.job4j.poly;

public interface Transport {

    void go();

    void passenger(int number);

    void fillUp(int liter, double money);
}
