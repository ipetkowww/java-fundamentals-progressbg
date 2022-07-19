package vehicle.vehicles;

public class Bus extends DriverLicensedVehicle {

    public Bus(String brand, double price) {
        super(brand, price);
    }

    @Override
    protected void drive() {
        super.driverLicense();
        super.drive();
    }

    @Override
    protected void setPrice(double price) {
        int validationPrice = 90_000;
        if (price < validationPrice) {
            throw new IllegalArgumentException("Bus price cannot be less than " + validationPrice);
        }
        super.setPrice(price);
    }
}
