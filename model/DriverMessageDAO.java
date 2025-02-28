package com.datapackage.dao;

import com.datapackage.model.DriverMessage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DriverMessageDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/contact";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    public List<DriverMessage> getAllMessages() {
        List<DriverMessage> messages = new ArrayList<>();

        try {
            Class.forName(DRIVER_CLASS);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "SELECT message FROM a_messages";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                messages.add(new DriverMessage(rs.getString("message")));
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
