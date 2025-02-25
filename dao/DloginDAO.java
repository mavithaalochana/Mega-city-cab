package com.datapackage.dao;

import com.datapackage.model.Dlogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Handles database interactions for driver login
 */
public class DloginDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/driver";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";

    public Dlogin authenticateUser(String email, String password) {
        Dlogin user = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            String sql = "SELECT * FROM drivertb WHERE email = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new Dlogin(rs.getInt("id"), rs.getString("email"), rs.getString("password"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}
