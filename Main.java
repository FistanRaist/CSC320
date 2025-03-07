import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomeInventory inventory = new HomeInventory();

        while (true) {
            System.out.println("\nHome Inventory System:");
            System.out.println("1. Add a new home");
            System.out.println("2. Remove a home");
            System.out.println("3. Update home details");
            System.out.println("4. List all homes");
            System.out.println("5. Save inventory to file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter square feet: ");
                        int squareFeet = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();

                        System.out.print("Enter city: ");
                        String city = scanner.nextLine();

                        System.out.print("Enter state: ");
                        String state = scanner.nextLine();

                        System.out.print("Enter zip code: ");
                        int zipCode = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter model name: ");
                        String modelName = scanner.nextLine();

                        System.out.print("Enter sale status (sold/available/under contract): ");
                        String saleStatus = scanner.nextLine();

                        Home home = new Home(squareFeet, address, city, state, zipCode, modelName, saleStatus);
                        System.out.println(inventory.addHome(home));
                        break;

                    case 2:
                        System.out.print("Enter address to remove: ");
                        String removeAddress = scanner.nextLine();
                        System.out.println(inventory.removeHome(removeAddress));
                        break;

                    case 3:
                        System.out.print("Enter address to update: ");
                        String updateAddress = scanner.nextLine();
                        System.out.print("Enter new sale status (sold/available/under contract): ");
                        String newStatus = scanner.nextLine();
                        System.out.println(inventory.updateHome(updateAddress, newStatus));
                        break;

                    case 4:
                        inventory.listHomes();
                        break;

                    case 5:
                        System.out.print("Would you like to print the information to a file? (Y or N): ");
                        String response = scanner.nextLine().trim().toUpperCase();
                        if (response.equals("Y")) {
                            String filePath = "C:\\Temp\\Home.txt"; // Predefined location
                            System.out.println(inventory.saveToFile(filePath));
                        } else if (response.equals("N")) {
                            System.out.println("File will not be printed.");
                        } else {
                            System.out.println("Invalid input. Please enter Y or N.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }
}