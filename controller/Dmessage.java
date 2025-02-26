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

/**
 * Servlet implementation class Dmessage
 */
@WebServlet("/Dmessage")
public class Dmessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dmessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String message = request.getParameter("message");
        
        if (message != null && message.trim().length() >= 5) {
            String url = "jdbc:mysql://localhost:3306/contact"; // Change to your DB details
            String user = "root";
            String password = "12345";
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, user, password);
                
                String query = "INSERT INTO driver_messages (dmessage) VALUES (?)"; // Change table and column as needed
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, message);
                stmt.executeUpdate();
                
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        response.sendRedirect("driver.jsp"); // Redirect to messages page after submission
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
