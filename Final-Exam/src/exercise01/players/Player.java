package exercise01.players;

import exercise01.enums.PlayerType;

public abstract class Player {

    private final String name;
    private final double salary;
    private final int age;
    private final double price;
    private final PlayerType playerType;

    public Player(String name, double salary, int age, double price, PlayerType playerType) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.price = price;
        this.playerType = playerType;
    }

    public abstract void play();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Name = %s | Position = %s | Salary = %.2f | Age = %d | Price = %.2f",
                name, playerType, salary, age, price);
    }

    public int getAge() {
        return age;
    }
}
