package lesson8HW.students;

public class Demo {



    public static Student createHighestParent() {

        Student student = new Student();
        return student;
    }

    public static Student createLowestChild() {


        Student student = new SpecialStudent();
        //SpecialStudent specialStudent = new SpecialStudent("100", 3, 123456789, 987654321, "colleg@gmail.com");
        return student;
    }

    public static void main(String[] args) {
        System.out.println(createHighestParent().toString());
        System.out.println(createLowestChild().toString());

    }
}
