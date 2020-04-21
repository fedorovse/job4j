package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    /**
     * Удаляет null элементы, сортирует по scope, удаляет студентов с scope < bonud.
     * @param students список на входе может содержать null элементы
     * @param bound минимальный проходной балл
     * @return список студентов удовлетворяющих условиям
     */
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .dropWhile(student -> student.getScore() < bound)
                .collect(Collectors.toList());
    }
}
