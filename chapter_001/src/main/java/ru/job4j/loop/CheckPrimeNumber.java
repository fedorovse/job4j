package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int finish) {
        boolean prime;
        if (finish < 2) {
            prime = false;
        } else {
            prime = true;
        }

        for (int index = 2; index < finish ; index++) {
            if(finish % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
