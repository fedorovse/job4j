package ru.job4j.lambda;

import java.util.Objects;
import java.util.Set;

public class Student implements Comparable {
    private int score;
    private String name;
    private Set<String> units;

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public Student(int score) {
        this.score = score;
    }

    public Set<String> getUnits() {
        return units;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(name, student.name)
                && Objects.equals(units, student.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name, units);
    }

    @Override
    public String toString() {
        return "Student{"
                + "score=" + score
                + ", name='" + name + '\''
                + ", units=" + units
                + '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Integer.compare(this.score, student.getScore());
    }
}
