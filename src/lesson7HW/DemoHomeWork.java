package lesson7HW;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {

    public Order createOrder() {
        Order order = new Order(100, new Date(System.currentTimeMillis()), false, null, "Dnepr", "Ukraine", "Buy");
        return order;
    }


    public Order createOrderAndCallMethods() {
        Order order = new Order(100, new Date(System.currentTimeMillis()),true, new Date(System.currentTimeMillis()),"Kiev", "Ukraine","SomeValue");
        order.checkPrice();
        order.confirmOrder();
        order.isValidType();
        return order;
    }
}
