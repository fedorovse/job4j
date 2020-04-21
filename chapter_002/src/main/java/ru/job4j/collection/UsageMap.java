package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>(
                Map.of("aaa@mail.ru", "Sergey", "bbb@yandex.ru", "Boris", "vased@bk.ru", "Sema")
        );
        for (String mail: names.keySet()) {
            System.out.println("mail: " + mail + " name: " + names.get(mail));
        }
    }
}
