package exercise01.main;

import exercise01.FootballClub;
import exercise01.enums.OrderBy;
import exercise01.exceptions.PlayerSameNameExistException;
import exercise01.players.Goalkeeper;
import exercise01.players.Player;
import exercise01.players.Striker;
import exercise01.players.Winger;

public class Demo {

    public static void main(String[] args) {

        Player tony = new Goalkeeper("Toni", 100_000, 32, 500_000, 30);
        Player ivan = new Winger("Ivan", 902_000, 25, 800_000, 22);
        Player gosho = new Striker("Georgi", 300_000, 30, 950_000, 30);
        Player ivan1 = new Striker("Ivan", 300_000, 18, 955_000, 35);
        Player dani = new Striker("Dani", 300_000, 30, 950_000, 30);

        FootballClub acMilan = new FootballClub("AC Milan");

        try {
            acMilan.buyPlayer(tony);
            acMilan.buyPlayer(ivan);
            acMilan.buyPlayer(gosho);
            acMilan.buyPlayer(dani);
            acMilan.buyPlayer(ivan1);
        } catch (PlayerSameNameExistException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Team size: " + acMilan.teamSize());
        System.out.println("Team worth: " + acMilan.teamWorth());

        try {
            acMilan.sellPlayer("Toni");
            acMilan.sellPlayer("Pesho");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Team size: " + acMilan.teamSize());
        System.out.println("Team worth: " + acMilan.teamWorth());



        acMilan.playerInfo("Ivan");
        acMilan.playerInfo("Georgi");
        acMilan.playerInfo("Toni");

        acMilan.printOrderedBy(OrderBy.AGE);
//        acMilan.printOrderedBy(OrderBy.SALARY);

        acMilan.startGame();
    }
}
