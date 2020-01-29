package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAdd3ItemsThenFind3Items() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        int result = tracker.findAll().length;
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenAdd2ItemsTestThenFindByName2ItemsTest() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test");
        Item test2 = new Item("test2");
        Item test3 = new Item("test");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        Item[] result1 = tracker.findByName("test");
        int result = result1.length;
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenTracerHasIdThenFindById1Item() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        String result = tracker.findById(test2.getId()).getName();
        String expect = "test2";
        assertThat(result, is(expect));
    }

    @Test
    public void whenTracerHasNoIdThenFindByIdNull() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        String result;
        if (tracker.findById("123") == null) {
            result = "null";
        } else {
            result = " ";
        }
        String expect = "null";
        assertThat(result, is(expect));
    }
}
