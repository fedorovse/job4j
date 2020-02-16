package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Sergey", "Fedorov", "9139106", "630048"));
        ArrayList<Person> persons = phones.find("Ser");
        String result = persons.get(0).getName();
        String expect = "Sergey";
        Assert.assertThat(result, is(expect));
    }
}
