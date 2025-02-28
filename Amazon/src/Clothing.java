public class Clothing extends Product {
    private String size;
    private String material;

    // Constructor
    public Clothing(int productID, String name, double price, int stockQuantity, String size, String material) {
        super(productID, name, "Clothing", price, stockQuantity); // Calling the superclass constructor
        this.size = size;
        this.material = material;
    }

    // Getters and Setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public double calculateDiscount() {
        // 10% discount for Electronics
        return getPrice() * 0.20;
    }
    @Override
    public String toString() {
        return super.toString() + ", Size: " + size + ", Material: " + material;
    }
}
