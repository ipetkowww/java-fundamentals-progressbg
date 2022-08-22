package exercise01;

import exercise01.enums.OrderBy;
import exercise01.exceptions.PlayerSameNameExistException;
import exercise01.players.Player;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FootballClub {

    private final String name;
    private final Map<String, Player> players;

    public FootballClub(String name) {
        this.name = name;
        this.players = new TreeMap<>();
    }

    public void buyPlayer(Player player) throws PlayerSameNameExistException {
        String playerName = player.getName();
        if (!players.containsKey(playerName)) {
            players.put(playerName, player);
            System.out.printf("Player %s joined our club!%n", playerName);
            return;
        }
        throw new PlayerSameNameExistException("Player with name: " + playerName + " already exist in our club!");
    }

    public void sellPlayer(String playerName) {
        if (!players.containsKey(playerName)) {
            throw new IllegalArgumentException(
                    String.format("Player with name: %s does not exist in our club!", playerName));
        }
        players.remove(playerName);
        System.out.printf("We sold player %s to another club!%n", playerName);
    }

    public void startGame() {
        for (Player player : players.values()) {
            player.play();
        }
    }

    public int teamSize() {
        return players.size();
    }

    public double teamWorth() {
        double teamWorth = 0;
        for (Player player : players.values()) {
            teamWorth += player.getPrice();
        }
        return teamWorth;
    }

    public void playerInfo(String playerName) {
        if (!players.containsKey(playerName)) {
            System.out.printf("Player %s is not part of our club.%n", playerName);
            return;
        }
        Player player = players.get(playerName);
        System.out.println(player);
    }

    public void printOrderedBy(OrderBy orderBy) {
        System.out.printf("=== Players sorted by %s ===%n", orderBy);
        switch (orderBy) {
            case AGE -> printOrderedByAge();
            case PRICE -> printOrderedByPrice();
            case SALARY -> printOrderedBySalary();
            case NAME -> printOrderedByName();
        }
    }

    private void printOrderedBySalary() {
        players.values().stream()
                .sorted(Comparator.comparingDouble(Player::getSalary))
                .forEach(System.out::println);
    }

    private void printOrderedByAge() {
        players.values().stream()
                .sorted(Comparator.comparingInt(Player::getAge))
                .forEach(System.out::println);
    }

    private void printOrderedByPrice() {
        players.values().stream()
                .sorted(Comparator.comparingDouble(Player::getPrice))
                .forEach(System.out::println);
    }

    private void printOrderedByName() {
        players.values().forEach(System.out::println);
    }
}
