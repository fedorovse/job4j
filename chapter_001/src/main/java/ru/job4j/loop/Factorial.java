package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int result = 1;
        if(n == 0 || n == 1) {
            return result;
        } else {
            for (int index = 1; index <= n; index++) {
                result = result * index;
            }
            return result;
        }
    }
}
