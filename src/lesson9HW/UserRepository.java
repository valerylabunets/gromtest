package lesson9HW;

import java.util.Arrays;

public class UserRepository {

    private User[] users;

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

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


    //User repository, part 4

    /* напишите метод для добавления нового юзера в условную базу данных (массив):
    User save(User user) - будет добавлять юзера и возвращать его
    Eсли юзер уже есть в массиве, результат - null. Если размер массива не позволяет добавить больше элементов (все ячейки заняты) результат метода тоже null
    Метод должен быть доступен всем
    Используйте метод с предыдущих задач для нахождение юзера по id.
    Только переменуйте его в findById(long id). Метод должен быть доступен, только внутри класса UserRepository */

    public User save(User user) {

        if (user == null) {
            return null;
        }
        if (findById(user.getId()) != null) {
            return null;
        }
        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        return null;

    }

    //User repository, part 5

    /* В продолжении практических задач, в классе UserRepository, напиши методы для удаления и обновления юзера в условной базе данных (массиве):
    User update(User user) - будет обновлять текущего юзера в массиве (перезаписывать) и возвращать его. Если юзера нет, результат метода null
    void delete(long id)- удаляет юзера с массива
    Методы должны быть доступны всем
    Используйте метод findById(long id) с предыдущих задач для нахождение юзера по id.
    Метод должен быть доступен, только внутри класса UserRepository
    В этой задаче так же нужно сабмитить класс User, созданный в одной из предудыщих задач урока
     */
    public User update(User user) {

        if (findById(user.getId()) == null) {
            return null;
        }
        int index = 0;
        for (User us : users) {
            us = users[index];
            if (us != null && findById(us.getId()) == us) {
                 users[index] = user;
                 break;
            }
            index++;
        }

        return user;
    }

    public void delete(long id) {



        int index = 0;
        for (User us : users) {
            if (us != null && us.getId() == id ) {
                users[index] = null;
            }
            index++;
        }

    }

}
