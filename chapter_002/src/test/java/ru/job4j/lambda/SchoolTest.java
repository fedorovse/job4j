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
        List<Student> expect = Arrays.asList(
                new Student(70),
                new Student(95)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentsFrom50To70() {
        List<Student> in = List.of(
                new Student(68),
                new Student(70),
                new Student(55),
                new Student(38)
        );
        School school = new School();
        List<Student> result = school.collect(in, x -> x.getScore() >= 50 && x.getScore() < 70);
        List<Student> expect = Arrays.asList(
                new Student(68),
                new Student(55)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentFrom0To50() {
        School school = new School();
        List<Student> in = List.of(
                new Student(0),
                new Student(50),
                new Student(38),
                new Student(66)
        );
        List<Student> result = school.collect(in, x -> x.getScore() > 0 && x.getScore() < 50);
        List<Student> expect = Arrays.asList(
                new Student(38)
        );
        assertThat(result, is(expect));
    }
}
