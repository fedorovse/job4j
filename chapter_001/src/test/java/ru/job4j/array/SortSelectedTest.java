package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {

    @Test
    public void sortSelectedTest5 () {
        int[] input = {3, 5, 1, 4, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void sortSelectedTestWhen3() {
        assertThat(
                SortSelected.sort(new int[] {6, 2, 8}
                ),
                is(new int[] {2, 6, 8})
        );
    }

    @Test
    public void sortSelectedTestWhen2() {
        assertThat(
                SortSelected.sort(new int[] {3, 2}
                ),
                is(new int[] {2, 3})
        );
    }
}
