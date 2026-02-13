package seng2050.lab2;

import java.io.File;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws  ServletException, IOException{
            HttpSession session = request.getSession(false);

            if (session != null) {
                session.invalidate();

            }
            response.getWriter().println("Logged out successfully.");
        }
}
