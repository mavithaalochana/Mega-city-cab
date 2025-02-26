package com.datapackage.dao;

import com.datapackage.model.DRegister;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Handles database operations for driver registration
 */
public class DRegisterDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/driver"; // Update with your DB details
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";

    public boolean registerDriver(DRegister driver) {
        boolean isSuccess = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            String sql = "INSERT INTO drivertb (full_name, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, driver.getFullName());
            stmt.setString(2, driver.getEmail());
            stmt.setString(3, driver.getPassword());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                isSuccess = true;
            }

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
