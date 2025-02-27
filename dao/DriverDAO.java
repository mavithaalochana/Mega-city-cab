package com.datapackage.dao;

import com.datapackage.model.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DriverDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/booking_details";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public List<Driver> getAllBookings() {
        List<Driver> bookings = new ArrayList<>();

        try {
            Class.forName(DRIVER_CLASS);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "SELECT * FROM bookings";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                bookings.add(new Driver(
                    rs.getInt("id"),
                    rs.getString("orderNumber"),
                    rs.getString("customerRegNumber"),
                    rs.getString("nicNumber"),
                    rs.getString("customerName"),
                    rs.getString("address"),
                    rs.getString("telephone"),
                    rs.getString("destination"),
                    rs.getString("vehicleCategory"),
                    rs.getDouble("kilometers"),
                    rs.getDouble("totalAmount")
                ));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bookings;
    }
}
