//Jeremy Carney, CSC320, Dr. Dong Nguyen, 02/02/2025

import java.util.Scanner;

public class TaxRate {
    public static void main(String[] args) {
        // Prompt for user input and convert it to an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your weekly income to calculate the average tax withholding: ");
        int wIncome = scanner.nextInt();

        // Determine tax rate based on weekly income
        double tRate;
        if (wIncome < 500) {
            tRate = 0.10;
        } else if (wIncome < 1500) {
            tRate = 0.15;
        } else if (wIncome < 2500) {
            tRate = 0.20;
        } else {
            tRate = 0.30;
        }

        // Calculate the average tax withholding
        double avgTax = wIncome * tRate;

        // Output the results
        System.out.printf("For an income of $%d, your tax rate is %.0f%%.%n", wIncome, tRate * 100);
        System.out.printf("Your average tax withholding is $%.2f.%n", avgTax);

        scanner.close();
    }
}
