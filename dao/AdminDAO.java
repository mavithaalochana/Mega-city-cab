package com.datapackage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.datapackage.model.Admin;

public class AdminDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/admin";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public boolean registerAdmin(Admin admin) {
        String sql = "INSERT INTO admintb (full_name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure MySQL Driver is loaded
            
            stmt.setString(1, admin.getFullName());
            stmt.setString(2, admin.getEmail());
            stmt.setString(3, admin.getPassword());

            return stmt.executeUpdate() > 0; // Return true if insertion is successful

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
