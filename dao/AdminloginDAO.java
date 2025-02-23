package com.datapackage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminloginDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/admin";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";

    public boolean authenticateAdmin(String email, String password) {
        boolean isValid = false;
        String sql = "SELECT * FROM admintb WHERE email = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                isValid = true;
            }
            
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
