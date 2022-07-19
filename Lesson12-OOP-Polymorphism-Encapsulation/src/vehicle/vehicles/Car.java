package vehicle.vehicles;

public class Car extends DriverLicensedVehicle {

    public Car(String brand, double price) {
        super(brand, price);
    }

    @Override
    protected void drive() {
        super.driverLicense();
        super.drive();
    }

    @Override
    protected void setPrice(double price) {
        int validationPrice = 70_000;
        if (price < validationPrice) {
            throw new IllegalArgumentException("Car price cannot be less than " + validationPrice);
        }
        super.setPrice(price);
    }
}
