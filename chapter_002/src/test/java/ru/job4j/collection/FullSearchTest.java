package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = new ArrayList<>(
                List.of(new Task("1", "First desk"),
                new Task("2", "Second desk"),
                new Task("1", "First desk"))
        );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}
