package homework;

public class Task12 {

    public static void main(String[] args) {
        for (int i = 102; i <= 987; i++) {
            int lastDigit = i % 10;
            int secondDigit = i / 10 % 10;
            int firstDigit = i / 100;

            if (firstDigit != secondDigit && secondDigit != lastDigit && firstDigit != lastDigit) {
                System.out.println(i);
            }
        }
    }
}
