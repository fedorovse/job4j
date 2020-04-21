package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import ru.job4j.tracker.Item;

public class DownSortByNameItemTest {

    @Test
    public void downSortByNameItem() {

        ArrayList<Item> list = new ArrayList<>(
                List.of(new Item("abc"), new Item("bbc"), new Item("bas"))
        );
        Collections.sort(list, new DownSortByNameItem());
        String result = list.get(0).getName() + " " + list.get(1).getName() + " " + list.get(2).getName();
        String expect = "bbc bas abc";
        assertThat(result, is(expect));
    }
}
