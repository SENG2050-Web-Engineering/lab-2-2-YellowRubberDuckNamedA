package seng2050.lab2;

import java.io.File;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title> Hello </title> </head>");
        out.println("<body>");
        out.println("\t<h1> Coding is interesting, lets see if this works</h1>");
        

        String value = req.getParameter("FirstName");
        out.println("\t<h4> I am John" + value + "</h4>");
        if (value == null)
        {
        // the parameter wasn’t passed
        }
        
        else if (value == ("somevalue"))
            out.println("\t<h4> I am John" + value + "</h4>");
        {
        // the parameter was an expected value
        // sometimes you may like to check against a regex
        }
        // else {}
        // some other value was found


        out.println("</body>");
        out.println("</html>");
            }
}
