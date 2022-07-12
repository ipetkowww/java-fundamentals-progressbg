package homework11.cardealership;

public class Person {

    String name;
    double budget;

    Person(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    double getBudget() {
        return budget;
    }

    void setBudget(double budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    String pickCar(Car car) {
        String message;

        if (getBudget() >= car.getPrice()) {
            double budgetLeft = getBudget() - car.getPrice();
            setBudget(budgetLeft);
            message = String.format("Congratulations! You have bought %s for %.2f dollars. Drive safe!",
                    car.getModel(), car.getPrice());
        } else {
            message = "You do not have sufficient funds to buy this car.";
        }

        return message;
    }
}
