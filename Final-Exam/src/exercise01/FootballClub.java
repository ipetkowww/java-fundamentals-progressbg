package exercise01;

import exercise01.enums.OrderBy;
import exercise01.exceptions.PlayerSameNameExistException;
import exercise01.players.Player;

import java.util.*;

public class FootballClub {

    private final String name;
    private final Map<String, Player> players;

    public FootballClub(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }

    public void buyPlayer(Player player) throws PlayerSameNameExistException {
        String playerName = player.getName();
        if (players.containsKey(playerName)) {
            throw new PlayerSameNameExistException("Player with name: " + playerName + " already exist in our club!");
        }
        players.put(playerName, player);
        System.out.printf("Player %s joined our club!%n", playerName);
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
        if (players.containsKey(playerName)) {
            Player player = players.get(playerName);
            System.out.println(player);
        } else {
            System.out.printf("Player %s is not part of our club.%n", playerName);
        }
    }

    public String getName() {
        return name;
    }

    public void printOrderedBy(OrderBy orderBy) {
        System.out.printf("=== Players sorted by %s ===%n", orderBy);
        switch (orderBy) {
            case AGE: printOrderedByAge(); break;
            case PRICE: printOrderedByPrice(); break;
            case SALARY: printOrderedBySalary(); break;
            case NAME: printOrderedByName(); break;
        }
    }

    private void printOrderedBySalary() {
        new ArrayList<>(players.values()).stream()
                .sorted(Comparator.comparingDouble(Player::getSalary))
                .forEach(System.out::println);
    }

    private void printOrderedByAge() {
        new ArrayList<>(players.values()).stream()
                .sorted(Comparator.comparingInt(Player::getAge))
                .forEach(System.out::println);
    }

    private void printOrderedByPrice() {
        new ArrayList<>(players.values()).stream()
                .sorted(Comparator.comparingDouble(Player::getPrice))
                .forEach(System.out::println);
    }

    private void printOrderedByName() {
        new ArrayList<>(players.values()).stream()
                .sorted(Comparator.comparing(Player::getName))
                .forEach(System.out::println);
    }
}
