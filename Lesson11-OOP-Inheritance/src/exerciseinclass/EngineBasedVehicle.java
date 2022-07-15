package exerciseinclass;

public class EngineBasedVehicle extends Vehicle {

    private String engineType;

    public EngineBasedVehicle(String brand, double price, int wheels, String engineType) {
        super(brand, price, wheels);
        this.engineType = engineType;
    }

    public String getEngineInfo() {
        return String.format("Engine of %s is %s", getBrand(), engineType);
    }
}
