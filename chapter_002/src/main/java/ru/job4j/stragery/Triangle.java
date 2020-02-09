package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @version 1
 * @since 09.02.2020
 */
public class Triangle implements Shape {

    /**
     * Формирование треугольника в консоли
     * @return треугольника в виде строки
     */
    @Override
    public String draw() {
        StringJoiner triangle = new StringJoiner(System.lineSeparator());
        triangle.add("*");
        triangle.add("**");
        triangle.add("***");
        triangle.add("****");
        triangle.add("*****");
        return triangle.toString();
    }
}
