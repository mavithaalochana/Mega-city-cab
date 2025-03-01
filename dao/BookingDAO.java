package com.datapackage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.datapackage.model.Booking;

public class BookingDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/booking_details";
    private String jdbcUser = "root";
    private String jdbcPassword = "12345";

    public boolean saveBooking(Booking booking) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);

            // Insert booking details into the database
            String sql = "INSERT INTO bookings (orderNumber, customerRegNumber, nicNumber, customerName, " +
                         "address, telephone, destination, vehicleCategory, kilometers, totalAmount) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, booking.getOrderNumber());
            pstmt.setString(2, booking.getCustomerRegNumber());
            pstmt.setString(3, booking.getNicNumber());
            pstmt.setString(4, booking.getCustomerName());
            pstmt.setString(5, booking.getAddress());
            pstmt.setString(6, booking.getTelephone());
            pstmt.setString(7, booking.getDestination());
            pstmt.setString(8, booking.getVehicleCategory());
            pstmt.setInt(9, booking.getKilometers());
            pstmt.setDouble(10, booking.getTotalAmount());

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
