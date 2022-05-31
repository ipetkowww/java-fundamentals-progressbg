package homework;

import java.util.Scanner;

public class Task01 {
//        Write a program that receives the current number of the month (e.g. 11) and prints the name of the month, e.g. "November"
//        You will use the Scanner class to achieve it
//        If the number is not a valid Month number, the program should return "Invalid input"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number [1.. 12]:");
        int monthAsNumber = scanner.nextInt();

        if (monthAsNumber < 1 || monthAsNumber > 12) {
            System.out.println("Invalid input");
        } else {
            String month = "";
            switch (monthAsNumber) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
            }
            System.out.println(month);
        }

    }
}
