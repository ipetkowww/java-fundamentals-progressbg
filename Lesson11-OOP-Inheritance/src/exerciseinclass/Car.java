package exerciseinclass;

public class Car extends EngineBasedVehicle {

    public Car(String brand, double price, int wheels, String engineType) {
        super(brand, price, wheels, engineType);
    }

    @Override
    public String getInfo() {
        return "This is a car: " + super.getInfo();
    }
}
