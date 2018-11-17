package lesson6;

public class Demo {
    public static void main(String[] args) {
        Car carobject = new Car(10000, 2015, "Anton");

        System.out.println(carobject.color);
        System.out.println(carobject.horsePower);

        System.out.println(carobject.ownerName);

        carobject.horsePower = 100;

        System.out.println(carobject.horsePower);

        carobject.startRun();
        carobject.stopRun();

        carobject.chengeOwner("Test");

        System.out.println(carobject.ownerName);

        Car carObjecr2 = null;
        System.out.println(carObjecr2);

    }
}
