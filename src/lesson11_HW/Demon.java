package lesson11_HW;

public class Demon {

    public static void main(String[] args) {

        //В класе Demo в main методе протестируйте свое решение на тестовых данных, чтобы убедиться в его правильности.
        // При этом Демо класс не нужно сабмитить на сайт

        Room room1 = new Room(100, 1, "Hayat", "Paris");
        Room room2 = new Room(150, 2, "Hillton", "London");
        Room room3 = new Room(200, 2, "Eden", "Deli");
        Room room4 = new Room(50, 1, "Base", "Odessa");
        Room room5 = new Room(250, 3, "Leon", "Lviv");
        Room room6 = new Room(300, 3, "White Horse", "Riga");
        Room room7 = new Room(300, 4, "Leon", "Lviv");
        Room room8 = new Room(350, 4, "Eden", "Deli");
        Room room9 = new Room(100, 1, "Hayat", "Paris");
        Room room10 = new Room(150, 2, "Hillton", "London");
        Room room11 = new Room(200, 2, "Eden", "Deli");
        Room room12 = new Room(50, 1, "Base", "Odessa");
        Room room13 = new Room(250, 3, "Leon", "Lviv");
        Room room14 = new Room(300, 3, "White Horse", "Riga");
        Room room15 = new Room(300, 4, "Leon", "Lviv");
        Room room16 = new Room(350, 4, "Eden", "Deli");

        Room[] rooms = new Room[]{room1, room2, room3, room4, room5, room6, room7, room8, room9, room10, room11, room12, room13, room14, room15, room16};
        Room room = new Room(rooms);
        System.out.println("first mayak");
        //Controller controller = new Controller();

        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();

        System.out.println("second mayak");
        find(room, bookingComAPI);
        find(room, tripAdvisorAPI);
        find(room, googleAPI);


//        controller.requestRooms(controller, bookingComAPI);
        System.out.println("third mayak");

    }


    private static void find(Room room, API api) {
        //api.findRooms();

    }

//        private static void find(Room[] rooms, API bookingComAPI, API TripAdvisorAPI, API GoogleAPI) {
//
//    }

}

