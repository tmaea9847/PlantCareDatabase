package plantCareInfo;

import java.util.List;
import java.util.Scanner;

public class PlantManager {
    public static void main(String[] args) {
        PlantService plantService = new PlantService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("1. View all plants");
        System.out.println("2. Search for a plant");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            // Fetch and display all plants using instance
            List<Plant> plants = plantService.getAllPlants(); 
            if (plants.isEmpty()) {
                System.out.println("No plants found in the database.");
            } else {
                System.out.println("All plants:");
                plants.forEach(System.out::println);
            }
        } else if (choice == 2) {
            // searching for a plant
            System.out.print("Enter the plant name to search: ");
            String plantName = scanner.nextLine();
            List<Plant> plants = plantService.searchPlantsByName(plantName);

            if (plants.isEmpty()) {
                System.out.println("There are no plants found with the name '" + plantName + "'.");
            } else {
                System.out.println("Found plants:");
                plants.forEach(System.out::println);
            }
        } else {
            System.out.println("Option is unavailable at this time...");

        scanner.close();
    } // end of main
} // end of PlantManager
