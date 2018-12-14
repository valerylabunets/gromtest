package lesson10HW;

import java.util.Date;

public class Demo {
    public static void main(String[] args) { /* В классе Demo в main методе создайте по 2 объекта каждого из классов
                                               Order. Вызовите у них все три метода в правильной очередности */

        //Customer customer1 = new Customer();
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("testElectr1", new Date(), "Odessa"
                ,"Kharkov", 100, new Customer("Ivan", "Dnepr", "male"), 12);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("testElectr2", new Date(), "Dnepr"
                , "Kiev", 200, new Customer("Olga", "Lvov", "fimale"), 24);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("testFurnit1", new Date(), "Odessa"
                , "Lvov", 500, new Customer("Ben", "Odessa", "male"), "111");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("testFurnit1", new Date(), "Kharkov"
                , "Kiev", 600, new Customer("Marta", "Kiev", "fimale"), "222");


        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();

        electronicsOrder2.validateOrder();
        electronicsOrder2.calculatePrice();
        electronicsOrder2.confirmShipping();

        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();

        furnitureOrder2.validateOrder();
        furnitureOrder2.calculatePrice();
        furnitureOrder2.confirmShipping();


    }
}
