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

    public int guaranteeMonts;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonts) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonts = guaranteeMonts;
    }

    @Override
    void validateOrder() {
        if ((getShipFromCity() != "Kiev" || getShipFromCity() != "Kharkov" || getShipFromCity() != "Dnepr" || getShipFromCity() != "Odessa")
                || (getShipToCity() != "Kiev" || getShipToCity() != "Kharkov" || getShipToCity() != "Dnepr" || getShipFromCity() != "Odessa")
                || (getBasePrice() < 100)
                || (getCustomerOwned().getGender() != "fimale"))
        {
            setDateConfirmed(new Date());
            //System.out.println("Order is impossible");
            //throw new Exception("Order is impossible");
        }

    }

    @Override
    void calculatePrice() {
        if (getBasePrice() > 1000) {
            if (getShipToCity() != "Kiev" || getShipToCity() != "Odessa") {
                double totalPrice = (getBasePrice() + getBasePrice() * 0.15);
                setTotalPrice(totalPrice - totalPrice*0.05);
            } else {
                double totalPrice = getBasePrice() + getBasePrice() * 0.10;
                setTotalPrice(totalPrice - totalPrice*0.05);
            }
        } else {
            if (getShipToCity() != "Kiev" || getShipToCity() != "Odessa") {
                double totalPrice = (getBasePrice() + getBasePrice() * 0.15);
                setTotalPrice(totalPrice);
            } else {
                double totalPrice = getBasePrice() + getBasePrice() * 0.10;
                setTotalPrice(totalPrice);
            }
         }

    }
}
