package lesson9HW;

import java.util.Arrays;

public class Demo {//mmmmmmmm

    public static void main(String[] args) {
        User user = new User(1236456, "Denis", "00011");
        User user1 = new User(111, "Ivan", "001");
        User user2 = new User(222, "Pavel", "002");
        User user3 = new User(333, "Igor","003");
        User user4 = new User(444, "Serg", "004");
        User user5 = new User(555, "John", "005");
        User user100 = new User(100, "Add", "100");

        User[] users = {user, user1, user2, user3, user4, user5, null, null, null, null};


        UserRepository userRepository = new UserRepository(users);
//        System.out.println(Arrays.toString(userRepository.getUserNames()));
//        System.out.println(Arrays.toString(userRepository.getUserIds()));
//        System.out.println(userRepository.getUserByName("Petro"));
       // System.out.println(userRepository.getUserById(331));
       // System.out.println(userRepository.getUserBySessionId("009"));
        System.out.println(userRepository.save(user100));



    }
}
