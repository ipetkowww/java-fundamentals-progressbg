package homework11.cardealership;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CarShop carShop = new CarShop();
        System.out.printf("Welcome to the %s!%n", carShop.getName());

        Person person = createPerson();
        System.out.printf("Welcome %s!%n", person.getName());
        showCarsIn(carShop);

        System.out.println("Display the cars in ascending or descending order by price");
        System.out.println("- Please enter [a] for ascending order");
        System.out.println("- Please enter [d] for descending order");
        String userChoice = scanner.next();

        if (userChoice.equals("a")) {
            carShop.sortCarsInAscendingOrderByPrice();
        } else if (userChoice.equals("d")) {
            carShop.sortCarsInDescendingOrderByPrice();
        }
        showCarsIn(carShop);

        Car car = pickCarBasedOnModelFrom(carShop);

        if (car == null) {
            System.out.println("Invalid or unknown car");
        } else {
            String message = person.pickCar(car);
            System.out.println(message);
        }
    }

    static Person createPerson() {
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.print("Please enter your budget: ");
        double budget = scanner.nextDouble();

        return new Person(name, budget);
    }

    static void showCarsIn(CarShop carShop) {

        System.out.println("=====================");
        System.out.println("You may now choose to buy any of our cars:");
        carShop.showAvailableCars();
        System.out.println("=====================");
    }

    static Car pickCarBasedOnModelFrom(CarShop carShop) {
        System.out.print("Please pick a car: ");
        String model = scanner.next();
        return carShop.getCar(model);
    }

}
