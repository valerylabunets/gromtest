package lesson10.polyexample;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("test ");
        run(human);

        System.out.println();

        User user = new User("Jack");
        run(user);

    }

    public static void run(Human human) {
        human.run();
    }
}
