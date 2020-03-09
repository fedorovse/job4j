package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        char[] o1CharArray = o1.toCharArray();
        char[] o2CharArray = o2.toCharArray();
        int result = 0;
        int charArrayLength = o1.length() < o2.length() ? o1.length() : o2.length();
        for (int index = 0; index < charArrayLength; index++) {
            result = Character.compare(o1CharArray[index], o2CharArray[index]);
            if (result != 0) {
                return  result;
            }
        }
        if (o1.length() == o2.length()) {
            result = 0;
        } else {
            result = o1.length() > o2.length() ? 1 : -1;
        }
        return result;
    }
}
