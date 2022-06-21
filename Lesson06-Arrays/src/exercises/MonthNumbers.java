package exercises;

public class MonthNumbers {
    public static void main(String[] args) {
        String[] monthsNames = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        for (int i = 0; i < monthsNames.length; i++) {
            System.out.printf("Month %d is called %s%n", i + 1, monthsNames[i]);
        }
    }

}
