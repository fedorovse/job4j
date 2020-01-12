package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
       int result;
       result = first >= second ? first : second;
       return result;
    }
}
