package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    /**
     * Отсортированный по city список уникальных адресов
     * @param profiles база клиентов
     * @return Отсортированный по city список уникальных адресов
     */
    public static List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
        return result.stream()
                .sorted((x1, x2) -> x1.getCity().compareTo(x2.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}
