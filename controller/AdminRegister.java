package com.datapackage.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.datapackage.dao.AdminDAO;
import com.datapackage.model.Admin;

/**
 * Servlet implementation class AdminRegister
 */
@WebServlet("/AdminRegister")
public class AdminRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AdminRegister() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        String fullName = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Admin admin = new Admin(fullName, email, password);
        AdminDAO adminDAO = new AdminDAO();

        boolean isRegistered = adminDAO.registerAdmin(admin);

        try (var out = response.getWriter()) {  // ✅ Ensures PrintWriter is properly closed
            out.println("<html><body>");

            if (isRegistered) {
                out.println("<h2 style='color:green;'>Registration Successful!</h2>");
                out.println("<p>Thank you, <b>" + fullName + "</b>. Your account has been created.</p>");
                out.println("<a href='AdminLogin.jsp'>Go to Admin Login</a>");
            } else {
                out.println("<h2 style='color:red;'>Registration Failed!</h2>");
                out.println("<p>Email may already be registered.</p>");
                out.println("<a href='AdminRegister.jsp'>Back to Registration</a>");
            }

            out.println("</body></html>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
