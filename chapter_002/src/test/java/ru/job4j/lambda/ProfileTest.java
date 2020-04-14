package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;

public class ProfileTest {

    @Test
    public void profilesToListAddresses() {
        List<Profile> in = Arrays.asList(
                new Profile(new Address("Moskva", "Puka", 1, 5)),
                new Profile(new Address("Tverb", "Tik", 4, 22)),
                new Profile(new Address("Moskva", "Puka", 1, 5)),
                new Profile(new Address("Opel", "Vano", 17, 6))
        );
        List<Address> result = Collect.collect(in);
        List<Address> expected = Arrays.asList(
                new Address("Moskva", "Puka", 1, 5),
                new Address("Opel", "Vano", 17, 6),
                new Address("Tverb", "Tik", 4, 22)
        );
        assertThat(result, is(expected));
    }
}
