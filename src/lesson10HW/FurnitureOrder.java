package lesson10HW;

import java.util.Date;

public class FurnitureOrder extends Order { /* Класс FurnitureOrder описывает заказы мебели. У него есть дополнительное поле:
                                          String furnitureCode
                                          Класс реализовывает абстрактные методы по правилам:

                                          валидация
                                          Заказ возможен с городов: Киев, Львов и в любой город. Минимальная цена заказа 500.
                                          Так же имя клиента который делает заказ не может быть "Тест", а пол может быть любым

                                          расчет цены
                                          Коммисия за доставку - 5% от суммы заказа если сумма меньше 5000 и 2% в других случаях */

    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        if (getShipFromCity() == "Киев"
                || getShipFromCity() == "Львов"
                || getBasePrice() >= 500
                || getCustomerOwned().getName() == "Тест")
        {
            setDateConfirmed(new Date());
            //System.out.println("Order is impossible");
        }

    }

    @Override
    void calculatePrice() {

        if (getBasePrice() < 5000) {
            double totalPrice = getBasePrice() + getBasePrice() * 0.05;
            setTotalPrice(totalPrice);
        } else {
            double totalPrice = getBasePrice() + getBasePrice() * 0.02;
            setTotalPrice(totalPrice);
        }
    }
}
