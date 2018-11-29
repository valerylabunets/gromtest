package lesson9HW;

import java.util.Arrays;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {//получение массива имен пользователей
        int count = 0;
        int i = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        String[] getUserNames = new String[count];
        for (i = 0; i < getUserNames.length; i++) {
            getUserNames[i] = users[i].getName();
         }

        return getUserNames;
    }

    public long[] getUserIds() {//получение массива id пользователей
        int count = 0;
        int i = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        long[] getUserIds = new long[count];
        for (i = 0; i < getUserIds.length; i++) {
            getUserIds[i] = users[i].getId();
        }

        return getUserIds;
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
