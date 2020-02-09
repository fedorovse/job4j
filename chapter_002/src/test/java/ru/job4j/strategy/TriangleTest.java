package ru.job4j.strategy;

import org.junit.Test;
import ru.job4j.stragery.Triangle;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.StringJoiner;

/**
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @version 1
 * @since 09.02.2020
 */
public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringJoiner(System.lineSeparator())
                .add("*")
                .add("**")
                .add("***")
                .add("****")
                .add("*****")
                .toString()
                )
        );
    }
}
