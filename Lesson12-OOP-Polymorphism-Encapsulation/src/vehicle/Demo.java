package vehicle;

import vehicle.vehicles.Bike;
import vehicle.vehicles.Bus;
import vehicle.vehicles.Car;

public class Demo {

    public static void main(String[] args) {
        Vehicle bike = new Bike("Bike-BMX", 500);
        Vehicle car = new Car("Car-Honda", 80_000);
        Vehicle bus = new Bus("Bus-Mercedes", 90_001);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bike;
        vehicles[1] = car;
        vehicles[2] = bus;

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
            System.out.println(vehicle);
        }
    }
}
