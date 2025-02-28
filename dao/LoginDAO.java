package com.datapackage.dao;

import com.datapackage.model.Login;
import java.sql.*;

public class LoginDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/register";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public boolean authenticateUser(Login login) {
        boolean isValid = false;

        try {
            Class.forName(DRIVER_CLASS);
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login.getEmail());
            stmt.setString(2, login.getPassword());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                isValid = true;
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
