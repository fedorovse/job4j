package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] o1Strings = o1.split("/");
        String[] o2Strings = o2.split("/");
        if (o2Strings[0].compareTo(o1Strings[0]) == 0) {
            rsl = o1.compareTo(o2);
        } else {
            rsl = o2Strings[0].compareTo(o1Strings[0]);
        }
        return rsl;
    }
}
