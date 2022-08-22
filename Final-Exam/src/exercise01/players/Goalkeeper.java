package exercise01.players;

import exercise01.enums.PlayerType;

public class Goalkeeper extends Player {

    private final int goalsSaved;

    public Goalkeeper(String name, double salary, int age, double price, int goalsSaved) {
        super(name, salary, age, price, PlayerType.GOALKEEPER);
        this.goalsSaved = goalsSaved;
    }

    @Override
    public void play() {
        System.out.printf("I am %s and I am a goalkeeper. I am on position and ready to defend our goal line!%n",
                getName());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Goals Saved = %d", goalsSaved);
    }
}
