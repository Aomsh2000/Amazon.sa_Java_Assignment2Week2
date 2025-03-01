# Amazon.sa_Java_Assignment2Week2
Java OOP Implementation - Amazon Order System
This repository contains a Java implementation of an Order Management System with Object-Oriented Programming (OOP) principles. The project demonstrates the application of key OOP concepts like inheritance, polymorphism, encapsulation, and abstraction.

GitHub Repository Link:
[Amazon Order System - GitHub Repository](https://github.com/Aomsh2000/Amazon.sa_Java_Assignment2Week2.git)

Key OOP Concepts Implemented
1. Encapsulation
Encapsulation is the mechanism of hiding the internal state and requiring all interaction to be performed through an object's methods.

Usage in this project:
In this system, the Product, Order, and OrderDetail classes encapsulate their properties. For example, the Product class hides the ProductID, Name, Price, etc., behind private fields and exposes them through getters and setters. This ensures that data is accessed or modified only in controlled ways.

Example:

public class Product {
    private int productID;
    private String name;
    private double price;

    // Getter and Setter methods
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

2. Inheritance
Inheritance is a mechanism where a new class derives properties and behaviors from an existing class. This enables code reusability and extension.

Usage in this project:
A base class Product is inherited by specific product categories such as Electronics and Clothing. The derived classes can extend the functionality or add specific properties.

Example:
public class Electronics extends Product {
    private boolean hasWarranty;

    // Constructor
    public Electronics(int productID, String name, double price, boolean hasWarranty) {
        super(productID, name, price);  // Call the constructor of the base class
        this.hasWarranty = hasWarranty;
    }

    // Getter and Setter for Warranty
    public boolean hasWarranty() {
        return hasWarranty;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }
}

3. Polymorphism
Polymorphism allows objects of different classes to be treated as objects of a common superclass. It also enables the same method to behave differently depending on the object that it is acting upon.

Usage in this project:
In the Product class, we have an overridden method calculateDiscount(). This method is overridden in different product types like Electronics and Clothing to apply category-specific discount rules.

Example:
public class Product {
    public double calculateDiscount() {
        return this.price * 0.05;  // Default discount for general products
    }
}

public class Electronics extends Product {
    @Override
    public double calculateDiscount() {
        return this.price * 0.10;  // Higher discount for electronics
    }
}

public class Clothing extends Product {
    @Override
    public double calculateDiscount() {
        return this.price * 0.15;  // Special discount for clothing
    }
}

4. Abstraction
Abstraction is the concept of hiding the implementation details and showing only the functionality to the user.

Usage in this project:
The Order and OrderDetail classes abstract the details of the order processing and only expose methods necessary for interacting with the order system. For example, a user can add an item to their order, but they don't need to worry about the internal logic of how the order is processed.

Example:
public class Order {
    private List<OrderDetail> orderDetails = new ArrayList<>();

    // Method to add items to the order
    public void addItem(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    // Abstract method to calculate the total price
    public double calculateTotal() {
        double total = 0;
        for (OrderDetail detail : orderDetails) {
            total += detail.getSubTotal();
        }
        return total;
    }
}

5. Exception Handling (Bonus Concept)
We have also implemented custom exceptions to handle business logic errors, such as when a user tries to place an order with insufficient stock.

Example of custom exception:
public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
Project Structure
The project consists of the following classes:

Product.java - Contains product details like ID, name, price, stock quantity, and discount calculations.
Order.java - Manages customer orders.
OrderDetail.java - Represents a product and quantity in an order.
OutOfStockException.java - A custom exception for handling out-of-stock scenarios.
OrderSystem.java - A class to simulate placing orders, updating stock, and calculating totals.
How to Use
Clone the repository:

git clone https://github.com/Aomsh2000/Amazon.sa_Java_Assignment2Week2.git
Compile and run the program:

Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).
Run the OrderSystem class to start interacting with the system.
Example Usage:

Create products and orders in the OrderSystem class.
Add items to an order and display the total amount.
Handle out-of-stock conditions using the OutOfStockException.
Contributing
Feel free to open issues or submit pull requests if you'd like to contribute to the project.

Conclusion
This project is a simple demonstration of applying key OOP principles in Java. The focus is on maintaining clean, modular code that adheres to OOP concepts like inheritance, polymorphism, abstraction, and encapsulation.
