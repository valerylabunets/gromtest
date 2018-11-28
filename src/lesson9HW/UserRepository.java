package lesson9HW;

import java.util.Arrays;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public UserRepository() {
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {//получение массива имен пользователей
        User user = new User();
        int count = 0;
//        if (users[i].getName() != null) {
//           count++;
//        }
        String[] users = new String[count];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
                users[i] = user.getName();
            }

        }
        return users;
    }

    public long[] getUserIds() {//получение массива id пользователей
        User user = new User();
        int count = 0;
        if (user.getId() != 0) {
            count++;
        }
        long[] users = new long[count];
        for (int i = 0; i < users.length; i++ ) {
            users[i] = user.getId();
        }
        return users;
    }

        public String getUserNameById(long id) { //для получения имени пользователя, по его id

            String result = null;
            for (User user : users) {
                if (user != null && user.getId() == id) {
                    result = user.getName();
                    break;
                }
            }
            return result;
        }

    @Override
    public String toString() {
        return Arrays.toString(users);
    }

    //нахождение юзера по имени
    public String getUserByName(String name) {

        return null;
    }

    //нахождение юзера по id
    public long getUserById(long id) {

        return 0;
    }

    //нахождение юзера по essionId
    public String getUserBySessionId(String sessionId) {

        return null;
    }

}
