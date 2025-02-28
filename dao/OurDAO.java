package com.datapackage.dao;

import com.datapackage.model.Our;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OurDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/add_vehicle";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public List<Our> getAllVehicles() {
        List<Our> vehicles = new ArrayList<>();

        try {
            Class.forName(DRIVER_CLASS);
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            String query = "SELECT vehicle_name, vehicle_category, vehicle_image FROM vehicle";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Our vehicle = new Our(
                    rs.getString("vehicle_name"),
                    rs.getString("vehicle_category"),
                    rs.getString("vehicle_image")
                );
                vehicles.add(vehicle);
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vehicles;
    }
}
