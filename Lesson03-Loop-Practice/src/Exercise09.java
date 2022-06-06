import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double taxInclusivePrice;
        double tax = 0.07;
        double totalPrice = 0;
        double totalActualPrice = 0;
        double totalSalesTax = 0;

        do {
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            taxInclusivePrice = scanner.nextDouble();

            if (taxInclusivePrice != -1) {
                double actualPrice = taxInclusivePrice / (1 + tax);
                double salesTax = taxInclusivePrice - actualPrice;

                System.out.printf("Actual Price is : $%.2f, Sales Tax is: $%.2f%n%n", actualPrice, salesTax);
                totalPrice += taxInclusivePrice;
                totalActualPrice += actualPrice;
                totalSalesTax += salesTax;
            }

        } while (taxInclusivePrice != -1);

        System.out.printf("Total Price is: $%.2f%n", totalPrice);
        System.out.printf("Total Actual Price is: $%.2f%n", totalActualPrice);
        System.out.printf("Total Sales Tax is: $%.2f%n", totalSalesTax);
    }
}
