package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorJobDescByName() {
        Comparator<Job> cmpDecsByName = new JobDescByName();
        int result = cmpDecsByName.compare(
                new Job("A task", 0),
                new Job("The bug", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorJobAscendingByName() {
        Comparator<Job> cmpAscendingByName = new JobAscendingByName();
        int result = cmpAscendingByName.compare(
                new Job("A task", 0),
                new Job("The bug", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorJobDescByPriority() {
        Comparator<Job> cmpDecsByPriority = new JobDescByPriority();
        int result = cmpDecsByPriority.compare(
                new Job("A task", 0),
                new Job("The bug", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorJobAscendingByPriority() {
        Comparator<Job> cmpAscendingByPriority = new JobAscendingByPriority();
        int result = cmpAscendingByPriority.compare(
                new Job("A task", 0),
                new Job("The bug", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndDescByPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndAscendingByPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscendingByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 2),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByPriorityAndAscendingByName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobAscendingByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
