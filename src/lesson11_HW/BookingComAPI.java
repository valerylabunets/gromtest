package lesson11_HW;

import java.util.Arrays;

public class BookingComAPI implements API {

    Room[] rooms = new Room[100];
    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public BookingComAPI() {

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        Room[] findRooms = new Room[count];
        for (Room room: rooms) {
            if (room != null && room.getPrice() - 50 < room.getPrice() && room.getPrice() >= room.getPrice() +50) {
                findRooms[count] = room;
                count++;
            }
        }
         return findRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
