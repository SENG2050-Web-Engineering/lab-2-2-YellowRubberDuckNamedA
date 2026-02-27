package seng2050.lab2;

import java.io.File;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class generateValidHTML extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    
        resp.setContentType("text/html");

        String firstName = req.getParameter("first name");
        String lastName = req.getParameter("last name");


        if (firstName == null || firstName.isEmpty()) {
            firstName = "Guest";
            lastName = "";
        }

        PrintWriter out = resp.getWriter();
      out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title> Hello </title> </head>");
        out.println("<body>");
        out.println("<form action=\"/HelloWorldServlet\" method=\"POST\">");
        out.println("Name: <input type=\"text\" name=\"name\" /> <br/>");
        out.println("Age: <input type=\"text\" age=\"age\" /> <br/>");
        out.println("<input type='submit'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
}
