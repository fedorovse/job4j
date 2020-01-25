package ru.job4j.oop.professions;

public class Programmer extends Engineer {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void performTask(Task task) {
        super.performTask(task);
    }
}
