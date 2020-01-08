package ru.job4j.calculator;

/**
 * Class Calculator Класс Калькулятор выполнение арифметических операций +, -, *, /.
 * @author Fedorov Sergey (ingor-ru@mail.ru)
 * @since 08.01.2020
 * @version 1
 */

public class Calculator {

    /**
     * Method add Выполняет сложение двух чисел и выводит его на консоль
     * @param first double первое слогаемое
     * @param second double второе слогаемое
     */
    public static void add (double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Method subtract Выполняет вычитание двух чисел и выводит его на консоль
     * @param first double - уменьшаемое
     * @param second double - вычитаемое
     */
    public static  void subtract (double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Method div Выполняет операцид деление двух чисел и выводит результат на консоль
     * @param first double - делимое
     * @param second double - делитель
     */
    public static void div (double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Method multiply Перемножает два принятых числа и выводит результат произведения на консоль
     * @param first double - первый множитель
     * @param second double - второй множитель
     */
    public static void multiply (double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Main - тестирование всех методов класса Calculator
     * @param args - args
     */
    public static void main (String[] args) {
        add(1,1);
        div(4,2);
        multiply(2,1);
        subtract(10,5);

    }
}
