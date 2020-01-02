package ru.job4j.calculator;

public class Size {
    public int add(int right, int left) {
        int result = right + left;
        return result;
    }

    public void info(int size) {
        System.out.println("Your size is: " + size);
    }

    public static void main(String[] args) {
        Size size = new Size();
        int puma = 20;
        int dear = 15;
        int value = size.add(puma, dear);
        size.info(value);
    }
}
