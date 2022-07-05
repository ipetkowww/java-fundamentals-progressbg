package exercises;

public class Exercise01 {

    public static void main(String[] args) {
        int[][] daysInMonth = {
                {31},
                {28},
                {31},
                {30},
                {31},
                {30},
                {31},
                {31},
                {30},
                {31},
                {30},
                {31},
        };

        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.printf("Number of days of month %d (%s) are: %d%n", i + 1, months[i], daysInMonth[i][0]);
        }
    }
}
