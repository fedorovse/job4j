package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        CreateAction createAction = new CreateAction();
        createAction.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expect = new Item("Fix PC");
        Assert.assertThat(created.getName(), is(expect.getName()));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new Item");
        tracker.add(item);
        String id = item.getId();
        String[] answers = {id, "renamed Item"};
        Input input = new StubInput(answers);
        EditAction editAction = new EditAction();
        editAction.execute(input, tracker);
        Item renamed = tracker.findById(id);
        Assert.assertThat(renamed.getName(), is("renamed Item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new Item");
        tracker.add(item);
        String id = item.getId();
        String[] answers = {id};
        Input input = new StubInput(answers);
        DeleteAction deleteAction = new DeleteAction();
        deleteAction.execute(input, tracker);
        Assert.assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrintMenu() {
        PrintStream stdOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(stdOut);
    }
}
