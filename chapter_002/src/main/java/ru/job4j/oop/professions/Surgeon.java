package ru.job4j.oop.professions;

public class Surgeon extends Doctor {

    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void operation(Patient patient) {
    }
}
