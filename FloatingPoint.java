//Jeremy Carney, 02/09/2025, CSUGlobal, CSC320

import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        float total = 0; // Initialize total to store the sum of the values
        float max = Float.MIN_VALUE; // Initialize max with the smallest possible float value
        float min = Float.MAX_VALUE; // Initialize min with the largest possible float value
        int count = 0; // Initialize count to keep track of the number of inputs

        while (count < 5) { // Loop until we have read five values
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextFloat()) { // Check if the next input is a floating-point value
                float value = scanner.nextFloat(); // Read the floating-point value
                total += value; // Add the value to the total
                if (value > max) { // Update max if the current value is greater
                    max = value;
                }
                if (value < min) { // Update min if the current value is smaller
                    min = value;
                }
                count++; // Increment the count
            } else {
                System.out.println("Invalid input. Please enter a floating-point value.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate the average
        float average = total / count;
        // Calculate interest on total at 20%
        float interest = total * 0.20f;

        // Print the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        // Close the scanner
        scanner.close();
    }
}

