package lesson8HW.students;

public class Demo {

    public static Student createHighestParent() {

        Student student = new Student("Ivan", "Bugrov", 10, null );
        return student;
    }

    public static SpecialStudent createLowestChild() {

        SpecialStudent specialStudent = new SpecialStudent(222222, "22222@gmail.com");
        return specialStudent;
    }

    public static void main(String[] args) {
        System.out.println("Highest Parent is: " + createHighestParent().toString());
        System.out.println("Lowest Child is: " + createLowestChild().toString());

    }
}
