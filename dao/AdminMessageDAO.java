package com.datapackage.dao;

import com.datapackage.model.AdminMessageModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminMessageDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/contact"; // Change to your DB details
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public List<AdminMessageModel> getDriverMessages() {
        List<AdminMessageModel> messages = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "SELECT dmessage FROM driver_messages"; // Change the table and column as needed
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                messages.add(new AdminMessageModel(rs.getString("dmessage")));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return messages;
    }
}
