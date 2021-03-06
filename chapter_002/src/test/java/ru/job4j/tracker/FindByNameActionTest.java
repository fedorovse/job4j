package ru.job4j.tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindByNameActionTest {

    @Test
    public void whenCheckOutputName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdOut = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindByNameAction action = new FindByNameAction();
        action.execute(new StubInput(new String[] {"fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("=== Find Item by name ====" + System.lineSeparator()
                        + "Order № 1 name: " + item.getName()
                        + " id: " + item.getId()
                )
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(stdOut);
    }
}
