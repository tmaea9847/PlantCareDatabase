package plantCareInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlantService {
    
    // Method to add a plant to the database
    public void addPlant(Plant plant) {
        String sql = "INSERT INTO plants (name, latinName, plantSpecOrigin, plantFamily, ratingForHomeGrowth, " +
                     "propagationMethod, careInstructions, lightRequirements, wateringSchedule, soilRequirements) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, plant.getName());
            pstmt.setString(2, plant.getLatinName());
            pstmt.setString(3, plant.getPlantSpecOrigin());
            pstmt.setString(4, plant.getPlantFamily());
            pstmt.setString(5, plant.getRatingForHomeGrowth());
            pstmt.setString(6, plant.getPropagationMethod());
            pstmt.setString(7, plant.getCareInstructions());
            pstmt.setString(8, plant.getLightRequirements());
            pstmt.setString(9, plant.getWateringSchedule());
            pstmt.setString(10, plant.getSoilRequirements());

            pstmt.executeUpdate();
            System.out.println("✅ Plant added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve all plants from the database
    public List<Plant> getAllPlants() {  // 🔹 THIS WAS MISSING
        List<Plant> plants = new ArrayList<>();
        String sql = "SELECT * FROM plants";

        try (Connection conn = DatabaseManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                plants.add(new Plant(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("latinName"),
                        rs.getString("plantSpecOrigin"),
                        rs.getString("plantFamily"),
                        rs.getString("ratingForHomeGrowth"),
                        rs.getString("propagationMethod"),
                        rs.getString("careInstructions"),
                        rs.getString("lightRequirements"),
                        rs.getString("wateringSchedule"),
                        rs.getString("soilRequirements")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plants;
    }

    // Method to search for plants by name
    public List<Plant> searchPlantsByName(String query) {
        List<Plant> plants = new ArrayList<>();
        String sql = "SELECT * FROM plants WHERE name LIKE ?";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + query + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                plants.add(new Plant(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("latinName"),
                        rs.getString("plantSpecOrigin"),
                        rs.getString("plantFamily"),
                        rs.getString("ratingForHomeGrowth"),
                        rs.getString("propagationMethod"),
                        rs.getString("careInstructions"),
                        rs.getString("lightRequirements"),
                        rs.getString("wateringSchedule"),
                        rs.getString("soilRequirements")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plants;
    }
}
