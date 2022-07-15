package exerciseinclass;

public class Bus extends EngineBasedVehicle {

    public Bus(String brand, double price, int wheels, String engineType) {
        super(brand, price, wheels, engineType);
    }

    @Override
    public String getInfo() {
        return "This is a bus: " + super.getInfo();
    }
}
