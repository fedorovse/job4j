package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdOut = System.out;
        System.setOut(new PrintStream(out));
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"one", "2"}));
        input.askInt("enter");
        assertThat(out.toString(), is(String.format("Please enter validate data again.%n")));
        System.setOut(stdOut);
    }

    @Test
    public void whenWrongNumberInput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdOut = System.out;
        System.setOut(new PrintStream(out));
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"9", "1"}));
        input.askInt("enter", 7);
        assertThat(out.toString(), is(String.format("Please select key from menu.%n")));
        System.setOut(stdOut);
    }
}
