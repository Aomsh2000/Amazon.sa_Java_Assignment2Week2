import java.util.ArrayList;
public class Product {
    private int ProductID;
    private String Name;
    private String Category;
    private double Price;
    private int StockQuantity;

    // Constructor
    public Product() {

    }
    public Product(int productID, String name, String category, double price, int stockQuantity) {
        this.ProductID = productID;
        this.Name = name;
        this.Category = category;
        this.Price = price;
        this.StockQuantity = stockQuantity;
    }
    //SETTER & GETTER

    public int getProductID() {
        return ProductID;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public String getCategory() {
        return Category;
    }

    public int getStockQuantity() {
        return StockQuantity;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setPrice(double price) {
        Price = price;
    }

    public void setCategory(String category) {
        Category = category;
    }
    public void setStockQuantity(int stockQuantity) {
        StockQuantity = stockQuantity;
    }

    //methods
    //display product details
    public void displayProduct() {
        System.out.println("\nProduct ID" + ProductID +
                "\nName: " + Name + "\nPrice: " + Price +
                "\nStock Quantity" +StockQuantity
                + "\n----------------------------");
    }
    //calculateDiscount(no discount)
    public double calculateDiscount() {
        return Price;
    }
    public double getSubTotal(int quantity) {
        return quantity * Price;
    }
    // Method to check stock before make order
    public void checkStock(int orderQuantity) throws OutOfStockException {
        if (orderQuantity > StockQuantity) {
            throw new OutOfStockException("Not enough stock for " + Name + ". Available: " + StockQuantity);
        }
    }
}



