package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o', '!'};
        char[] pref = {'H', 'e', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o', '!'};
        char[] pref = {'H', 'e', 'r'};
        boolean result = ArrayChar.startsWith(word, pref);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
