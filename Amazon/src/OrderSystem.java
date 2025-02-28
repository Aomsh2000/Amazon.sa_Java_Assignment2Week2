import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderSystem {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
    private ArrayList<Order> orderList = new ArrayList<>();
    private void viewProducts() {
        if(productList.isEmpty()){
            System.out.println("No products found.");
        }
        else {
            for (int i = 0; i < productList.size(); i++) {
                System.out.println("product Index: " +i);
                productList.get(i).displayProduct();
            }
        }

    }

    public void addToProductList(Product product) {
        productList.add(product);
    }
    public void addToOrderList(Order order) {
        orderList.add(order);
    }

    public void NewOrder() {

            System.out.println("We Are happy to be part of us :) ");
            System.out.println("Here Our products:");
            viewProducts();
            int choice2 = 1;
            Order order = new Order();
            while (choice2 != 0) {
                try {
                    System.out.println("Enter product Index: ");
                    int productChoice = scanner.nextInt();
                    System.out.println("Enter Quantity: ");
                    int QuantityChoice = scanner.nextInt();

                    Product product=productList.get(productChoice);
                    product.checkStock(QuantityChoice);
                    System.out.println("Valid Quantity");
                    OrderDetail newOrderDetail =new OrderDetail(order.getOrderID(),product.getProductID(), QuantityChoice, product.getSubTotal(QuantityChoice));
                    orderDetailList.add(newOrderDetail);
                    System.out.println("Enter 0 to stop the order OR other number to continue.. ");
                    choice2 = scanner.nextInt();

                } catch (OutOfStockException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            }
        order.setOrderDetails(orderDetailList);
        orderList.add(order);
        System.out.println("Congratulations! You have successfully completed your order! ");
        System.out.println(order.getOrderDetails());

        }
    public void ViewOrdersHistory() {
        boolean found = false;
        for (Order order : orderList) {

                found = true;
                System.out.println("Order ID: " + order.getOrderID());
                for (OrderDetail detail : order.getOrderDetails()) {
                    System.out.println("  Product ID: " + detail.getProductID());
                    System.out.println("  Quantity: " + detail.getQuantity());
                    System.out.println("  SubTotal: " + detail.getSubTotal());

                System.out.println("---------------");
            }
        }

        if (!found) {
            System.out.println("No orders found for you");
            var input = new Scanner(System.in);
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != 3) {
            System.out.println("----------Welcome to Amazon!----------");
            System.out.println("1. New Order");
            System.out.println("2. View Orders History");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("New Order");
                    NewOrder();
                    break;

                case 2:
                    System.out.println("View Orders History");
                    ViewOrdersHistory();
                    break;

                case 3:
                    System.out.println("See you soon!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose either 1, 2, or 3.");
                    break;
            }
        }

    }
}

