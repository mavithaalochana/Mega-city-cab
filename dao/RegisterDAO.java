package com.datapackage.dao;

import com.datapackage.model.Register;
import java.sql.*;

public class RegisterDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/register";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public boolean registerUser(Register user) {
        boolean isInserted = false;

        try {
            Class.forName(DRIVER_CLASS);
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            String sql = "INSERT INTO users (full_name, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getFullName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            int rowsInserted = stmt.executeUpdate();
            isInserted = rowsInserted > 0;

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isInserted;
    }
}
