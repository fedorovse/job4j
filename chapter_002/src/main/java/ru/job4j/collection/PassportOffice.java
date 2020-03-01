package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        Citizen result = null;
        for (Map.Entry entry: citizens.entrySet()) {
            if (entry.getKey().equals(passport)) {
                return citizens.get(entry.getKey());
            }
        }
        return result;
    }
}
