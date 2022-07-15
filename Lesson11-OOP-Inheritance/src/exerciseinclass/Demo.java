package exerciseinclass;

public class Demo {

    public static void main(String[] args) {

        Bike bike = new Bike("BMX", 600.50, 2);


        Car car = new Car("Honda", 9000, 4, "gasoline");
        System.out.println(car.getEngineInfo());

        Bus bus = new Bus("Mercedes", 15000, 6, "diesel");
        System.out.println(bus.getEngineInfo());


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bike;
        vehicles[1] = car;
        vehicles[2] = bus;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
