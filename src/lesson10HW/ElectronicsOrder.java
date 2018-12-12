package lesson10HW;

import java.util.Date;

public class ElectronicsOrder extends Order {

    public int guaranteeMonts;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonts) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonts = guaranteeMonts;
    }

    @Override
    void validateOrder() {

    }

    @Override
    void calculatePrice() {

    }
}
