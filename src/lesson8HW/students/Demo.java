package lesson8HW.students;

public class Demo {

    public static Student createHighestParent() {

        Student student = new CollegeStudent();
        return student;
    }

    public static SpecialStudent createLowestChild() {

        SpecialStudent specialStudent = new SpecialStudent();
        return specialStudent;
    }

    public static void main(String[] args) {
        System.out.println(createHighestParent().toString());
        System.out.println(createLowestChild().toString());

    }
}
