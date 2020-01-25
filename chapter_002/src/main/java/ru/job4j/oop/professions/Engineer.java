package ru.job4j.oop.professions;

public class Engineer extends Profession {
    private int skill;

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void performTask(Task task) {
    }
}
