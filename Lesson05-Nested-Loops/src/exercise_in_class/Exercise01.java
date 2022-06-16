package exercise_in_class;

public class Exercise01 {
//    Create a nested loop that iterates over 3 weeks
//    For each week, iterate over 7 days and print the number of the days.
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("  Day: " + j);
            }
        }
    }
}
