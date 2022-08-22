package exercise01.players;

import exercise01.enums.PlayerType;

public class Striker extends Player {

    private final int goalsScored;

    public Striker(String name, double salary, int age, double price, int goalsScored) {
        super(name, salary, age, price, PlayerType.STRIKER);
        this.goalsScored = goalsScored;
    }

    @Override
    public void play() {
        System.out.printf("I am %s and I am a striker. " +
                "I am on position and ready to score goals to the opposing team!%n", getName());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Goals Scored = %d", goalsScored);
    }
}
