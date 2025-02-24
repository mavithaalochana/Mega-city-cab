package com.datapackage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.datapackage.model.ContactModel;

public class ContactDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/contact";
    private String jdbcUser = "root";
    private String jdbcPassword = "12345";

    public boolean saveContact(ContactModel contact) {
        String sql = "INSERT INTO contact_messages (name, email, message) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getEmail());
            stmt.setString(3, contact.getMessage());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
