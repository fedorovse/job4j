package ru.job4j.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    Comparator<Address> cityComparator = (x1, x2) -> x1.getCity().compareTo(x2.getCity());

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().map(x -> x.getAddress()).collect(Collectors.toList());
        return result.stream()
                .sorted((x1, x2) -> x1.getCity().compareTo(x2.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(address, profile.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "Profile{"
                + "address="
                + address
                + '}';
    }
}
