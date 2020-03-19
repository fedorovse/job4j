package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] o1Strings = o1.split("/");
        String[] o2Strings = o2.split("/");
        if (!o1Strings[0].equals(o2Strings[0])) {
            rsl = o2Strings[0].compareTo(o1Strings[0]);
        } else {
            String o1Str = "";
            String o2Str = "";
            if (o1Strings.length > 1) {
                for (int index = 1; index < o1Strings.length; index++) {
                    o1Str = o1Str + "/" + o1Strings[index];
                }
            }
            if (o2Strings.length > 1) {
                for (int index = 1; index < o2Strings.length; index++) {
                    o2Str = o2Str + "/" + o2Strings[index];
                }
            }
            rsl = o1Str.compareTo(o2Str);
        }
        return rsl;
    }
}
