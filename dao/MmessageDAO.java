package com.datapackage.dao;

import com.datapackage.model.Mmessage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MmessageDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/contact";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public List<Mmessage> getAllMessages() {
        List<Mmessage> messages = new ArrayList<>();

        try {
            Class.forName(DRIVER_CLASS);
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

            String sql = "SELECT name, email, message FROM contact_messages";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Mmessage message = new Mmessage(rs.getString("name"), rs.getString("email"), rs.getString("message"));
                messages.add(message);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return messages;
    }
}
