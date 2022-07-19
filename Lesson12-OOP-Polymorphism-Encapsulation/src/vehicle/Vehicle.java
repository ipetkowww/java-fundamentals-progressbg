package vehicle;

public class Vehicle {

    private String brand;
    private double price;

    protected Vehicle(String brand, double price) {
        setBrand(brand);
        setPrice(price);
    }

    protected void drive() {
        System.out.println("The driver is driving " + brand);
    }

    protected void setBrand(String brand) {
        if (brand != null && !brand.equals("")) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Brand name cannot be null or empty!");
        }
    }

    protected void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be zero or less than zero!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s. Price: %.2f", brand, price);
    }
}
