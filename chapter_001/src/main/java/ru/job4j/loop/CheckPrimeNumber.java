package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int finish) {
        boolean prime = false;
        for (int index = 2; index <= finish ; index++) {
            prime = true;
            if(finish % index == 0 && finish != index) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
