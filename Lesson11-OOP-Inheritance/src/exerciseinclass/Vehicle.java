package exerciseinclass;

public class Vehicle {

    private String brand;
    private double price;
    private int wheels;

    public Vehicle(String brand, double price, int wheels) {
        this.brand = brand;
        this.price = price;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public String getInfo() {
        return String.format("%s - Price: $%.2f, Wheels: %d.", brand, price, wheels);
    }
}
