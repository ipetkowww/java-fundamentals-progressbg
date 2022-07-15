package exerciseinclass;

public class Bike extends Vehicle {


    public Bike(String brand, double price, int wheels) {
        super(brand, price, wheels);
    }

    @Override
    public String getInfo() {
        return "This is a bike: " + super.getInfo();
    }
}
