package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.stragery.Paint;
import ru.job4j.stragery.Square;
import ru.job4j.stragery.Triangle;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

/**
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @version 1
 * @since 09.02.2020
 */
public class PaintTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(new StringJoiner(System.lineSeparator())
                .add("*****")
                .add("*****")
                .add("*****")
                .add("*****")
                .add("*****")
                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringJoiner(System.lineSeparator())
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
