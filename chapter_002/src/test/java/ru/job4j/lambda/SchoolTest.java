package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class SchoolTest {

    @Test
    public void whenStudentsFrom70To100() {
        List<Student> in = List.of(
                new Student(20),
                new Student(70),
                new Student(95),
                new Student(38)
        );
        School school = new School();
        List<Student> result = school.collect(in, x -> x.getScore() >= 70 && x.getScore() <= 100);
        System.out.println(result);
        List<Student> expect = Arrays.asList(
                new Student(70),
                new Student(95)
        );
        System.out.println(expect);
        assertThat(result, is(expect));
    }
}
