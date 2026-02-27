package seng2050.lab2;

import java.io.File;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        resp.setContentType("text/html");

        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title> Hello </title> </head>");
        out.println("<body>");
        out.println("<form action=\"/HelloWorldServlet\" method=\"POST\">");
        out.println("Username: <input type=\"text\" username=\"username\" /> <br/>");
        out.println("Password: <input type=\"text\" password=\"password\" /> <br/>");
        out.println("<input type='submit'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
            }
}
