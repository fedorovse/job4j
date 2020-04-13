package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert {

    public static void main(String[] args) {
        Integer[][] integers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> convertInt = Stream.of(integers).flatMap(x -> Stream.of(x)).collect(Collectors.toList());
        System.out.println(convertInt);
    }
}
