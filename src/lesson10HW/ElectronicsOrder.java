package lesson10HW;

import java.util.Date;

public class ElectronicsOrder extends Order { /* Класс ElectronicsOrder описывает заказы электроники. У него есть
                                               дополнительное поле:int guaranteeMonths
                                               Класс реализовывает абстрактные методы по правилам:

                                               валидация
                                               заказ возможен с городов: Киев, Одесса, Днепр, Харьков и в один из этих городов.
                                               Минимальная цена заказа 100. Так же имя клиента который делает заказ может быть
                                               любым, а пол только женским

                                               расчет цены
                                               Цена может состоит из цены товара и цены за доставку. Так же могут быть скидки.
                                               Если доставка производится в любой город, кроме Киева и Одессы, то цена
                                               за доставку - 15% от суммы заказа. В других случаях 10%. Так же если цена больше
                                               1000 то скидка на заказ 5% после оплаты комиссии за доставку*/

    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    void validateOrder() {
        if ((getShipFromCity() == "Киев" || getShipFromCity() == "Харьков" || getShipFromCity() == "Днепр" || getShipFromCity() == "Одесса")
                || (getShipToCity() == "Киев" || getShipToCity() == "Харьков" || getShipToCity() == "Днепр" || getShipFromCity() == "Одесса")
                || (getBasePrice() >= 100)
                || (getCustomerOwned().getGender() == "Женский"))
        {
            setDateConfirmed(new Date());
            //System.out.println("Order is impossible");
            //throw new Exception("Order is impossible");
        }

    }

    @Override
    void calculatePrice() {
        if (getBasePrice() > 1000) {
            if (getShipToCity() != "Киев" || getShipToCity() != "Одесса") {
                double totalPrice = (getBasePrice() + getBasePrice() * 0.15);
                setTotalPrice(totalPrice - totalPrice*0.05);
            } else {
                double totalPrice = getBasePrice() + getBasePrice() * 0.10;
                setTotalPrice(totalPrice - totalPrice*0.05);
            }
        } else {
            if (getShipToCity() != "Киев" || getShipToCity() != "Одесса") {
                double totalPrice = (getBasePrice() + getBasePrice() * 0.15);
                setTotalPrice(totalPrice);
            } else {
                double totalPrice = getBasePrice() + getBasePrice() * 0.10;
                setTotalPrice(totalPrice);
            }
        }

    }
}
