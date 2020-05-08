package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class GroupTest {

    @Test
    public void whenTwoStudentsAndThreeUnits() {
        List<Student> in = Arrays.asList(
                new Student("Vasia", Set.of("mat", "ekon", "java")),
                new Student("Petia", Set.of("ekon", "java")),
                new Student("Ola", Set.of("mat", "java"))
        );
        Map<String, Set<String>> result = Group.sections(in);
        Map<String, Set<String>> expected = Map.of(
                "mat", Set.of("Vasia", "Ola"),
                "ekon", Set.of("Vasia", "Petia"),
                "java", Set.of("Vasia", "Petia", "Ola")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneStudentsHaveNullUnits() {
        List<Student> in = Arrays.asList(
                new Student("Vasia", Set.of("mat", "ekon", "java")),
                new Student("Petia", new HashSet<String>()),
                new Student("Ola", Set.of("mat", "java"))
        );
        Map<String, Set<String>> result = Group.sections(in);
        Map<String, Set<String>> expected = Map.of(
                "mat", Set.of("Vasia", "Ola"),
                "ekon", Set.of("Vasia"),
                "java", Set.of("Vasia", "Ola")
        );
        assertThat(result, is(expected));
    }
}
