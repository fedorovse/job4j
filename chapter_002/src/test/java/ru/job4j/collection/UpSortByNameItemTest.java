package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import ru.job4j.tracker.Item;

public class UpSortByNameItemTest {

    @Test
    public void upSortByNameItem() {

        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("kfc"));
        list.add(new Item("abc"));
        list.add(new Item("iat"));
        Collections.sort(list, new UpSortByNameItem());
        String result = String.format("%s %s %s", list.get(0).getName(), list.get(1).getName(), list.get(2).getName());
        String expect = "abc iat kfc";
        assertThat(result, is(expect));
    }
}
