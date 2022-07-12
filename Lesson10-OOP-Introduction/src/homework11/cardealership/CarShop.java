package homework11.cardealership;

import java.util.Arrays;
import java.util.Comparator;

public class CarShop {

    String name;
    Car[] cars;

    CarShop() {
        this.name = "Big Decimal Auto Car Dealership";
        this.cars = new Car[]{
                new Car("Honda", 9_000),
                new Car("Audi", 20_000),
                new Car("VW", 5_000),
                new Car("Audi", 25_000),
                new Car("Ford", 1_500),
                new Car("Mercedes", 55_000)
        };
    }

    void showAvailableCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    String getName() {
        return name;
    }

    Car[] getAllAvailableCars() {
        return cars;
    }

    public Car getCar(String model) {
        Car foundCar = null;
        Car[] allAvailableCars = getAllAvailableCars();

        for (Car car : allAvailableCars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                foundCar = car;
                break;
            }
        }
        return foundCar;
    }

    public void sortCarsInAscendingOrderByPrice() {
        Arrays.sort(getAllAvailableCars(), Comparator.comparing(Car::getPrice));
    }

    public void sortCarsInDescendingOrderByPrice() {
        Arrays.sort(getAllAvailableCars(), Comparator.comparing(Car::getPrice).reversed());
    }
}
