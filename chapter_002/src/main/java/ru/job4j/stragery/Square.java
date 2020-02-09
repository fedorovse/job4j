package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @version 1
 * @since 09.02.2020
 */
public class Square implements Shape {

    /**
     * Формирование квадрата в консоли
     * @return квадрат в виде строки
     */
    @Override
    public String draw() {
        StringJoiner square = new StringJoiner(System.lineSeparator());
        square.add("*****");
        square.add("*****");
        square.add("*****");
        square.add("*****");
        square.add("*****");
        return square.toString();
    }
}
