package vehicle.vehicles;

import vehicle.Vehicle;

public class DriverLicensedVehicle extends Vehicle {

    DriverLicensedVehicle(String brand, double price) {
        super(brand, price);
    }

    void driverLicense() {
        System.out.println("The driver has a driver's license.");
    }
}
