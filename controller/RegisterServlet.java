package com.datapackage.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.datapackage.dao.RegisterDAO;
import com.datapackage.model.Register;
import java.io.PrintWriter;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullName = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Register user = new Register(fullName, email, password);
        RegisterDAO registerDAO = new RegisterDAO();

        boolean isRegistered = registerDAO.registerUser(user);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        if (isRegistered) {
            out.println("<html><body>");
            out.println("<h2 style='color:green;'>Registration Successful!</h2>");
            out.println("<p>Thank you, <b>" + fullName + "</b>. Your account has been created.</p>");
            out.println("<a href='Login.jsp'>Go to Login</a>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>Registration Failed!</h2>");
            out.println("<p>Something went wrong. Please try again.</p>");
            out.println("<a href='register.jsp'>Back to Registration</a>");
            out.println("</body></html>");
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
