package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sergey");
        student.setPatronymic("Evgenevich");
        student.setSurname("Fedorov");
        student.setGroup("Stazhor2020-PRO");
        student.setEntrance(new Date());
        System.out.println("Student : " + student.getSurname() + " " + student.getName() + " " + student.getPatronymic()
                + "\n" + "Group : " + student.getGroup()
                + "\n" + "Receipt date : " + student.getEntrance());
    }
}
