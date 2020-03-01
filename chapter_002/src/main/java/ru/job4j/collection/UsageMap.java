package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("aaa@mail.ru", "Sergey");
        names.put("bbb@yandex.ru", "Boris");
        names.put("vased@bk.ru", "Sema");
        for (String mail: names.keySet()) {
            System.out.println("mail: " + mail + " name: " + names.get(mail));
        }
    }
}
