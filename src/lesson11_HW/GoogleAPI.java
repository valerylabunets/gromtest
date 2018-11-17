package lesson11_HW;

import java.util.Arrays;

public class GoogleAPI implements API {

    Room[] rooms = new Room[15];

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public GoogleAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room[] findRooms = new Room[100];
        // Room[] result = null;

        for (Room room : rooms) {

            if (room != null) {
                if (room.getPrice() == price) {
                    findRooms = rooms;
                    return findRooms;
                }
            }
            if (room.getPersons() == persons) {
                findRooms = rooms;
                return findRooms;
            }

            if (room.getCityName().equals(city)) {
                findRooms = rooms;
                return findRooms;
            }
            if (room.getHotelName().equals(hotel)) {
                findRooms = rooms;
                return findRooms;
            } else {
                System.out.println("No rooms satisfy your request.");
            }
        }
        return findRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}


