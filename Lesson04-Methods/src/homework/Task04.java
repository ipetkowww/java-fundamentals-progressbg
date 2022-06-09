package homework;

public class Task04 {

    // Question 4 from http://www.beginwithjava.com/java/methods/questions.html
    public static void main(String[] args) {
        displayPrimerNumbersBetween(1, 500);
        displayPrimerNumbersBetween(300, 1000);
    }

    static void displayPrimerNumbersBetween(int start, int end) {
        System.out.printf("Displaying Primer Numbers between %d and %d%n", start, end);
        for (int i = start; i <= end; i++) {
            boolean isPrimeNumber = isPrime(i);
            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
        System.out.println("End");
        System.out.println();
    }

    static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
