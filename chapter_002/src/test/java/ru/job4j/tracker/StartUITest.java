package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
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
        StartUI.editItem(input, tracker);
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
        StartUI.deleteItem(input, tracker);
        Assert.assertThat(tracker.findById(id), is(nullValue()));
    }
}
