package lesson11_HW;

public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    API api1 = new BookingComAPI();
    API api2 = new TripAdvisorAPI();

    public Controller() {
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        Room[] requestRooms = new Room[count];
        for (Room room: requestRooms) {
            if(apis.equals(room)) {
                requestRooms[count] = room;
            }
        }
        return requestRooms;
    }
    public Room[] check(API api1, API api2) {
        int count = 0;
        Room[] check = new Room[count];
         for (Room room: check ) {
            if (api1.equals(api2)) {
                check[count] = room;
                count++;
            }
        }
        return check;
    }
    }

