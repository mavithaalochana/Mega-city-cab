package com.datapackage.dao;

import com.datapackage.model.Vehicle;
import java.sql.*;


public class VehicleDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/add_vehicle";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345";

    public void addVehicle(Vehicle vehicle) throws SQLException {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String sql = "INSERT INTO vehicle (vehicle_name, vehicle_category, vehicle_image) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, vehicle.getName());
            stmt.setString(2, vehicle.getCategory());
            stmt.setString(3, vehicle.getImagePath());
            stmt.executeUpdate();
        }
    }

    public void deleteVehicle(int id) throws SQLException {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String sql = "DELETE FROM vehicle WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public void updateVehicle(Vehicle vehicle) throws SQLException {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String sql = "UPDATE vehicle SET vehicle_name = ?, vehicle_category = ?, vehicle_image = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, vehicle.getName());
            stmt.setString(2, vehicle.getCategory());
            stmt.setString(3, vehicle.getImagePath());
            stmt.setInt(4, vehicle.getId());
            stmt.executeUpdate();
        }
    }
}