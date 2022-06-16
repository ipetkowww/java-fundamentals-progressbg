package homework;

public class Task01 {
    // Create a nested loop that iterates over 3 weeks
    // For each week, iterate over 7 days and print the number of the days.
    // Use WHILE loop
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;
        int startWeek = 1;

        while (startWeek <= weeks) {
            System.out.println("Week: " + startWeek);
            int day = 1;
            while (day <= days) {
                System.out.println("  Day: " + day);
                day++;
            }
            startWeek++;
        }
    }
}
