package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Что ты хочешь знать, смертный? ");
        String question = scanner.nextLine();

        int random = new Random().nextInt(3);
        String answer = "";
        switch (random) {
            case 0:
                answer = "Да будет так!";
                break;
            case 1:
                answer = "Не бывать этому никогда!";
                break;
            case 2:
                answer = "Ты ещё не готов для этого!";
                break;
            default:
        }
        System.out.println(answer);
    }
}
