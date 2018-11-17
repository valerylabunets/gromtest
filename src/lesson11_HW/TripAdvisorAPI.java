package lesson11_HW;

import java.util.Arrays;

public class TripAdvisorAPI implements API {

    Room[] rooms = new Room[100];
    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public TripAdvisorAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        Room[] findRooms = new Room[count];
        for (Room room: rooms) {
            if (room != null && room.getPersons() - 1 <= room.getPersons() && room.getPersons() >= room.getPersons() + 1) {
                findRooms[count] = room;
            }
        }
        return findRooms;
    }

    @Override
    public Room[] getAll() {
           return rooms;
    }

}
