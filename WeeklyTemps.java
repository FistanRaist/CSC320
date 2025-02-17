// Jeremy Carney, CSC320, 02/16/2025, Dr. Dong Nguyen
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemps {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding days of the week to the days list
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Prompting user for temperatures
        for (String day : days) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        // Displaying temperatures for each day with one decimal place
        for (int i = 0; i < days.size(); i++) {
            System.out.printf("%s: %.1f° F%n", days.get(i), temperatures.get(i));
        }

        // Calculating and displaying the weekly average temperature with one decimal place
        System.out.print("Enter 'week' to see the weekly average temperature: ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("week")) {
            double totalTemps = 0;
            for (double temp : temperatures) {
                totalTemps += temp;
            }
            double weeklyTemps = totalTemps / temperatures.size();
            System.out.printf("The weekly average temperature is: %.1f° F%n", weeklyTemps);
        }

        scanner.close();
    }
}
