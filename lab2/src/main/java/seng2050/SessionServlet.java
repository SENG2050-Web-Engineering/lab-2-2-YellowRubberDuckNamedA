package seng2050;

import java.io.File;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        HttpSession session = request.getSession();

        session.setAttribute( "username", "John Doe");

        response.getWriter().println("Session Created. User: " + session.getAttribute("username"));

}
}
