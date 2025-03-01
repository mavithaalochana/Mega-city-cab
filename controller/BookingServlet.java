package com.datapackage.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.datapackage.dao.BookingDAO;
import com.datapackage.model.Booking;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String orderNumber = request.getParameter("orderNumber");
	        String customerRegNumber = request.getParameter("customerRegNumber");
	        String nicNumber = request.getParameter("nicNumber");
	        String customerName = request.getParameter("customerName");
	        String address = request.getParameter("address");
	        String telephone = request.getParameter("telephone");
	        String destination = request.getParameter("destination");
	        String vehicleCategory = request.getParameter("vehicleCategory");
	        int kilometers = Integer.parseInt(request.getParameter("kilometers"));

	        // Create Booking object
	        Booking booking = new Booking(orderNumber, customerRegNumber, nicNumber, customerName, 
	                                      address, telephone, destination, vehicleCategory, kilometers);

	        // Call DAO to save booking
	        BookingDAO bookingDAO = new BookingDAO();
	        boolean success = bookingDAO.saveBooking(booking);

	        if (success) {
	            response.getWriter().println("Booking successfully saved! Total Amount: LKR " + booking.getTotalAmount());
	        } else {
	            response.getWriter().println("Error saving booking.");
	        }
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
