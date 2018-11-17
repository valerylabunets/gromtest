package lesson6;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    public void confirmOrder() {
        isConfirmed = true;
        dateConfirmed = new Date(System.currentTimeMillis());
    }

    public boolean checkPrice() {
        boolean bool;
        if (price > 1000) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public boolean isValidType() {

        boolean bool;
        if (type.equals("Buy") || type.equals("Sale")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
