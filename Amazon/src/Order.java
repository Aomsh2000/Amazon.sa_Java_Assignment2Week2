import java.util.ArrayList;

public class Order {
    private static int orderCounter = 1003;
    private static int UserCounter = 3;
    private int orderID;
    private int userID;
    private ArrayList<OrderDetail> orderDetails;

    // Constructor
    public Order(int orderID, int userID, ArrayList<OrderDetail> orderDetails) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderDetails = new ArrayList<>();
    }
    public Order( int userID, ArrayList<OrderDetail> orderDetails) {
        this.orderID = orderCounter++;
        this.userID = userID;
        this.orderDetails = new ArrayList<>();
    }
    public Order() {
        this.orderID = orderCounter++;
        this.userID = UserCounter++;
    }

    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderID + ", UserID: " + userID + ", OrderDetails: " + orderDetails;
    }
}
