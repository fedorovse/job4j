package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic interpreter = new DummyDic();
        String result = interpreter.engToRus("dummy");
        System.out.println(result  + ".");
    }
}
