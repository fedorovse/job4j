package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class EndsWithTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'k', 'o'};
        char[] post = {'l', 'k', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
