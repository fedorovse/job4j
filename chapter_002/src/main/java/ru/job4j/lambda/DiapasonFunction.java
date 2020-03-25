package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunction {

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        int length = end - start + 1;
        for (int index = 0; index < length; index++) {
            result.add(func.apply((double) start));
            start++;
        }
        return result;
    }
}
