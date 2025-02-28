public class Electronics extends Product {
    private int warrantyPeriod; // in months
    private String brand;

    // Constructor
    public Electronics(int productID, String name, double price, int stockQuantity, int warrantyPeriod, String brand) {
        super(productID, name, "Electronics", price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    // Getters and Setters
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public double calculateDiscount() {
        // 10% discount for Electronics
        return getPrice() * 0.10;
    }
    @Override
    public String toString() {
        return super.toString() + ", Warranty Period: " + warrantyPeriod + " months, Brand: " + brand;
    }
}
