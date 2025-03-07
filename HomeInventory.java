import java.io.*;
import java.util.*;

class Home {
    private int squareFeet;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String modelName;
    private String saleStatus; // Sold, Available, Under Contract

    // Constructor
    public Home(int squareFeet, String address, String city, String state, int zipCode, String modelName, String saleStatus) {
        this.squareFeet = squareFeet;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.modelName = modelName;
        this.saleStatus = saleStatus;
    }

    // Getters and Setters
    public String getAddress() { return address; }
    public void setSaleStatus(String saleStatus) { this.saleStatus = saleStatus; }

    // Override toString() for displaying home details
    @Override
    public String toString() {
        return "Model: " + modelName + "\n" +
               "Address: " + address + "\n" +
               "City: " + city + "\n" +
               "State: " + state + "\n" +
               "Zip Code: " + zipCode + "\n" +
               "Sale Status: " + saleStatus + "\n" +
               "------------------------";
    }
}

class HomeInventory {
    private List<Home> homes;

    // Constructor initializes empty list
    public HomeInventory() {
        homes = new ArrayList<>();
    }

    // Add a home
    public String addHome(Home home) {
        try {
            homes.add(home);
            return "Home added successfully!";
        } catch (Exception e) {
            return "Error adding home: " + e.getMessage();
        }
    }

    // Remove a home by address
    public String removeHome(String address) {
        try {
            Home homeToRemove = homes.stream().filter(h -> h.getAddress().equalsIgnoreCase(address)).findFirst().orElse(null);
            if (homeToRemove != null) {
                homes.remove(homeToRemove);
                return "Home removed successfully!";
            } else {
                return "Home not found!";
            }
        } catch (Exception e) {
            return "Error removing home: " + e.getMessage();
        }
    }

    // Update home sale status
    public String updateHome(String address, String newStatus) {
        try {
            Home homeToUpdate = homes.stream().filter(h -> h.getAddress().equalsIgnoreCase(address)).findFirst().orElse(null);
            if (homeToUpdate != null) {
                homeToUpdate.setSaleStatus(newStatus);
                return "Home updated successfully!";
            } else {
                return "Home not found!";
            }
        } catch (Exception e) {
            return "Error updating home: " + e.getMessage();
        }
    }

    // List all homes
    public void listHomes() {
        if (homes.isEmpty()) {
            System.out.println("No homes in inventory.");
        } else {
            homes.forEach(System.out::println);
        }
    }

    // Save to a file
    public String saveToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Home home : homes) {
                writer.write(home.toString());
                writer.newLine();
            }
            return "Inventory saved to " + filePath;
        } catch (IOException e) {
            return "Error saving to file: " + e.getMessage();
        }
    }
}