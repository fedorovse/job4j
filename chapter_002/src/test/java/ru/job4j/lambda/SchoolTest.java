package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

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

    @Test
    public void whenStudentToMap() {
        School school = new School();
        List<Student> in = List.of(
                new Student(0),
                new Student(50),
                new Student(38),
                new Student(66)
        );
        Map<Integer, Student> result = school.collect(in);
        Map<Integer, Student> expect = new HashMap<>();
        expect.put(0, new Student(0));
        expect.put(50, new Student(50));
        expect.put(38, new Student(38));
        expect.put(66, new Student(66));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentWithNull() {
        School school = new School();
        List<Student> in = new ArrayList<>();
        in.add(new Student(72));
        in.add(null);
        in.add(new Student(50));
        in.add(new Student(66));
        in.add(null);
        in.add(new Student(38));
        List<Student> result = school.levelOf(in, 40);
        List<Student> expect = List.of(
                new Student(50),
                new Student(66),
                new Student(72)
        );
        assertThat(result, is(expect));
    }
}
