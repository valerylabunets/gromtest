package lesson8HW.students;

public class SpecialStudent extends CollegeStudent {

    long secretKey;
    String email;

    public SpecialStudent(String collegeName, int rating, long id, long secretKey, String email) {
        super(collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent() {
    }

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(long secretKey, String email) {
        this.secretKey = secretKey;
        this.email = email;
    }
}
