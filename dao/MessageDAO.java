package com.datapackage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/contact";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";

    public boolean insertMessage(String message) {
        boolean isInserted = false;
        String sql = "INSERT INTO a_messages (message) VALUES (?)";
        
        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            stmt.setString(1, message);
            int rowsInserted = stmt.executeUpdate();
            
            isInserted = rowsInserted > 0;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return isInserted;
    }
}
