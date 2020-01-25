package ru.job4j.oop.professions;

public class Doctor extends Profession {

    private String diploma;
    private boolean internship;
    private String specialization;

    public String getDiploma() {
        return this.diploma;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public boolean getInternship() {
        return this.internship;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setInternship() {
        this.internship = internship;
    }

    public String diagnosis(Patient patient) {
        return "";
    }
}
