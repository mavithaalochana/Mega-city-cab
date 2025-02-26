package com.datapackage.dao;

import com.datapackage.model.Dmessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Handles database operations for driver messages
 */
public class DmessageDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/contact"; // Update with your DB details
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";

    public void saveMessage(Dmessage dmessage) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            String sql = "INSERT INTO driver_messages (dmessage) VALUES (?)"; // Adjust table and column names if needed
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, dmessage.getMessage());
            stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
