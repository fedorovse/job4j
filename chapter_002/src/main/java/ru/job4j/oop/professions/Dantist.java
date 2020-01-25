package ru.job4j.oop.professions;

public class Dantist extends Doctor {

    public void treat(Patient patient) {
        super.diagnosis(patient);
    }

    public void removeTooth(Patient patient) {
        super.diagnosis(patient);
    }
}
