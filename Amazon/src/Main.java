import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        // Create products
        Product product1 = new Product(101, "Laptop", "Electronics", 999.99, 50);
        orderSystem.addToProductList(product1);
        Product product2 = new Product(102, "Shirt", "Clothing", 29.99, 200);
        orderSystem.addToProductList(product2);
        Product product3 = new Product(103, "Smartphone", "Electronics", 599.99, 150);
        orderSystem.addToProductList(product3);
        Product product4 = new Product(104, "Coffee Maker", "Appliances", 79.99, 75);
        orderSystem.addToProductList(product4);
        Product product5 = new Product(105, "Jacket", "Clothing", 49.99, 120);
        orderSystem.addToProductList(product5);
        // Creating OrderDetails
        OrderDetail orderDetail1 = new OrderDetail(1, 1001, 101, 2, 199.98);
        OrderDetail orderDetail2 = new OrderDetail(2, 1001, 102, 1, 29.99);
        OrderDetail orderDetail3 = new OrderDetail(3, 1002, 103, 3, 149.97);

        // Creating an ArrayList of OrderDetails
        ArrayList<OrderDetail> orderDetails1 = new ArrayList<>();
        orderDetails1.add(orderDetail1);
        orderDetails1.add(orderDetail2);

        ArrayList<OrderDetail> orderDetails2 = new ArrayList<>();
        orderDetails2.add(orderDetail3);

        // Creating Orders
        Order order1 = new Order(1001, 1, orderDetails1);
        Order order2 = new Order(1002, 2, orderDetails2);
        orderSystem.addToOrderList(order1);
        orderSystem.addToOrderList(order2);

        // Create HashMap
        HashMap<Integer, Order> userOrderHistory = new HashMap<>();
        userOrderHistory.put(order1.getOrderID(), order1);
        userOrderHistory.put(order2.getOrderID(), order2);
        // display HashMap orders
        for (Integer orderID : userOrderHistory.keySet()) {
            System.out.println("OrderID As a key: " + orderID);
            System.out.println(userOrderHistory.get(orderID));
            System.out.println();
        }

        //stock is insufficient
        try {
            product1.checkStock(51);
            System.out.println("Order processed for " + orderDetails1);
        } catch (OutOfStockException e) {

            System.out.println("Error: " + e.getMessage());
        }
        // Try enough stock
        try {
            product2.checkStock(1);
            System.out.println("Order processed for " + orderDetails2);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Order system
        orderSystem.start();
    }
}