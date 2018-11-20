package lesson8HW.students;

import java.util.Date;

public class Course {

    Date startDate;
    String name;
    int hoursDuration;
    String techerName;
    Student[] students;

    public Course(Date startDate, String name, int hoursDuration, String techerName, Student[] students) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.techerName = techerName;
        this.students = students;
    }
}
