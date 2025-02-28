public class OrderDetail {
    private static int orderDetailCounter = 4;
    private int orderDetailID;
    private int orderID;
    private int productID;
    private int quantity;
    private double subTotal;

    // Constructor
    public OrderDetail(int orderDetailID, int orderID, int productID, int quantity, double subTotal) {
        this.orderDetailID =orderDetailID;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }
    public OrderDetail(int orderID,int productID, int quantity, double subTotal) {
        this.orderDetailID =orderDetailCounter++;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    // Getters and Setters
    public int getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "OrderDetailID: " + orderDetailID + ", ProductID: " + productID +
                ", Quantity: " + quantity + ", SubTotal: " + subTotal;
    }
}
