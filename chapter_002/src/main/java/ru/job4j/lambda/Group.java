package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    private static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(s -> s.getUnits().stream().map(t -> new Holder(t, s.getName()))
                // собираем объект Holder с unit и name
        ).collect(
                // собираем карту
                Collectors.groupingBy(t -> t.key, // определяем группировку
                        Collector.of(
                                HashSet::new, // аккумулятор.
                                (set, el) -> set.add(el.value), // как добавлять данные.
                                        (left, right) -> {
                                    left.addAll(right); return left;
                                } // для агрегации.
                        )
                )
        );
    }
}
