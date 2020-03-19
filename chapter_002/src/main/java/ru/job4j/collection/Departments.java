package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value: deps) {
            String start = "";
            for (String element: value.split("/")) {
                if (start.equals("")) {
                    start = start + element;
                } else {
                    start = start + "/" + element;
                }
                tmp.add(start);
            }
        }
        ArrayList<String> rsl = new ArrayList<>(tmp);
        sortAsc(rsl);
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
