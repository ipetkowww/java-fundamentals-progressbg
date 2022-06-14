package homework;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        System.out.println("Insert number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double groups = number / 4.0;
        int currentCardType = number / 4;
        double currentColour = groups - currentCardType;

        for (int i = number; i <= 52; i++) {
            switch (currentCardType) {
                case 0:
                    System.out.print("Two of ");
                    break;
                case 1:
                    System.out.print("Three of ");
                    break;
                case 2:
                    System.out.print("Four of ");
                    break;
                case 3:
                    System.out.print("Five of ");
                    break;
                case 4:
                    System.out.print("Six of ");
                    break;
                case 5:
                    System.out.print("Seven of ");
                    break;
                case 6:
                    System.out.print("Eight of ");
                    break;
                case 7:
                    System.out.print("Nine of ");
                    break;
                case 8:
                    System.out.print("Ten of ");
                    break;
                case 9:
                    System.out.print("Jack of ");
                    break;
                case 10:
                    System.out.print("Queen of ");
                    break;
                case 11:
                    System.out.print("King of ");
                    break;
                case 12:
                    System.out.print("Ace of ");
                    break;
            }

            if (currentColour <= 0.25) {
                System.out.print("Clubs, ");
                currentColour = 0.5;
            } else if (currentColour <= 0.5) {
                System.out.print("Diamonds, ");
                currentColour = 0.75;
            } else if (currentColour <= 0.75) {
                System.out.print("Hearts, ");
                currentColour = 0.8;
            } else {
                System.out.print("Spades, ");
                currentColour = 0;
                currentCardType++;
                System.out.println();
            }
        }
    }
}

