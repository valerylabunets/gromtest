package lesson9HW;

import java.util.Arrays;
import java.util.Scanner;

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

    //User repository, part 3
    /* Возвращайте null, если юзера найти не удалось. Если юзеров несколько -  возвращайте первый
       Методы должны быть доступны всем*/

    //нахождение юзера по имени
    public User getUserByName(String name) {

        int count = 0;
        int i = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName().equals(name)) {
                count++;
            }
        }
        User result = null;
        for (User user : users) {
            if (user != null && user.getName().equals(name)) {
                result = user;
            } else {
                if (user != null && user.getName().equals(name) && count > 1) {
                    result = user;
                }
            }
        }
        return result;
    }

    //нахождение юзера по id
    private User findById(long id) {
        int count = 0;
        int i = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                count++;
            }
        }
        User result = null;
        for (User user : users) {
            if (user != null && user.getId() == id) {
                result = user;
            } else {
                if (user != null && user.getId() == id && count > 1) {
                    result = user;
                }
            }
        }
        return result;
    }

    //нахождение юзера по sessionId
    public User getUserBySessionId(String sessionId) {
        int count = 0;
        int i = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getSessionId().equals(sessionId)) {
                count++;
            }
        }
        User result = null;
        for (User user : users) {
            if (user != null && user.getSessionId().equals(sessionId)) {
                result = user;
            } else {
                if (user != null && user.getName().equals(sessionId) && count > 1) {
                    result = user;
                }
            }
        }
        return result;
    }



}
