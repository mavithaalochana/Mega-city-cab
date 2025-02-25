package com.datapackage.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.datapackage.model.Data;

public class DataDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/booking_details";
    private String jdbcUser = "root";
    private String jdbcPassword = "12345";

    public List<Data> getAllData() {
        List<Data> dataList = new ArrayList<>();
        String query = "SELECT * FROM bookings";

        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Data data = new Data(
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
                );
                dataList.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataList;
    }
}
