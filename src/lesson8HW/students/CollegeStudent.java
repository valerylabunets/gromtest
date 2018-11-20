package lesson8HW.students;

public class CollegeStudent extends Student {

    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken) {
        super(firstName, lastName, group, coursesTaken);
    }
}
