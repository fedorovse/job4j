package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("IX task", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscendingByName().thenComparing(new JobAscendingByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscendingByPriority().thenComparing(new JobAscendingByName()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobAscendingByPriority()));
        System.out.println(jobs);
    }
}