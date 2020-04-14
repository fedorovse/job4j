package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert {

    /**
     * Преобразование матрицы в список
     *
     * @param integers матрица целых чисел
     * @return список чисел из матрицы
     */
    public List<Integer> convertMatrixToList(Integer[][] integers) {
        return Stream.of(integers).flatMap(Stream::of).collect(Collectors.toList());
    }
}
