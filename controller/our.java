package com.datapackage.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class our
 */
@WebServlet("/our")
public class our extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public our() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 List<String[]> vehicles = new ArrayList<>();

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/add_vehicle", "root", "12345");

             String query = "SELECT vehicle_name, vehicle_category, vehicle_image FROM vehicle";
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery();

             while (rs.next()) {
                 String[] vehicle = new String[3]; // Fix: No need for index 4
                 vehicle[0] = rs.getString("vehicle_name");  // Correct column names
                 vehicle[1] = rs.getString("vehicle_category");
                 vehicle[2] = rs.getString("vehicle_image");
                 vehicles.add(vehicle);
             }

             rs.close();
             pstmt.close();
             conn.close();
         } catch (Exception e) {
             e.printStackTrace();
         }

         request.setAttribute("add_vehicle", vehicles); // Ensure consistency
         request.getRequestDispatcher("Ourvehicle.jsp").forward(request, response);
     }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
