package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title> Hello </title> </head>");
        out.println("<body>");
        out.println("\t<h1> Hello World! (from Hello World Servlet)</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
