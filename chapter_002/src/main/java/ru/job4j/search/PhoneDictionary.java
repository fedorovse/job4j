package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public  void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
//    public ArrayList<Person> find(String key) {
////        ArrayList<Person> result = new ArrayList<>();
////        for (Person person: this.persons) {
////            if (person.getName().contains(key)
////                    || person.getSurname().contains(key)
////                    || person.getPhone().contains(key)
////                    || person.getAddress().contains(key)
////            ) {
////                result.add(person);
////            }
////        }
////        return result;
////    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = n -> n.getName().contains(key);
        Predicate<Person> sureName = n -> n.getSurname().contains(key);
        Predicate<Person> phone = n -> n.getPhone().contains(key);
        Predicate<Person> address = n -> n.getAddress().contains(key);
        Predicate<Person> combine = n -> {
            return name.or(sureName).or(phone).or(address).test(n);
        };
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
