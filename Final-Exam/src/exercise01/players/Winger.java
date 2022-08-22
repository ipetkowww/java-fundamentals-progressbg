package exercise01.players;

import exercise01.enums.PlayerType;

public class Winger extends Player{

    private final int goalPasses;

    public Winger(String name, double salary, int age, double price, int goalPasses) {
        super(name, salary, age, price, PlayerType.WINGER);
        this.goalPasses = goalPasses;
    }

    @Override
    public void play() {
        System.out.printf("I am %s and I am a winger. " +
                "I am on position and ready to support the attack and defense of our team!%n", getName());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Goal Passes = %d", goalPasses);
    }
}
