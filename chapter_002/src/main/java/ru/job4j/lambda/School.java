package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    Map<Integer, Student> collect(List<Student> students) {
        Map<Integer, Student> result = students.stream()
                .collect(Collectors.toMap(
                        Student::getScore,
                        student -> student)
                );
        return  result;
    }
}
