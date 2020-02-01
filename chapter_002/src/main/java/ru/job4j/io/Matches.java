package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        System.out.println("Игра СПИЧКИ");
        System.out.println("На столе лежат 11 спичек.");
        System.out.println("Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("Выигрывает тот, кто забрал последние спички.");
        System.out.println("");
        int match = 11;
        boolean game = true;
        Scanner input = new Scanner(System.in);
        int move = 0;
        while (game) {
            System.out.print("На столе " + match + " спичек. Тяните спички ");
            move = Integer.valueOf(input.nextLine());
            if (move > match) {
                System.out.println("Вы не можете взять больше спичек, чем есть на столе.");
            } else if (move > 0 && move <= 3) {
                match -= move;
                if (match == 0) {
                    System.out.println("Вы победили");
                    game = false;
                }
            } else {
                System.out.println("Вы можете взять только от 1 до 3 спичек.");
            }
        }
    }
}
