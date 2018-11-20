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
        super();
    }
}
