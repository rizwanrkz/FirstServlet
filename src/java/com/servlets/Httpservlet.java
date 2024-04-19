
package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Httpservlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        System.out.println("This servlet is created by extending HttpServlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is doGet method</h1>");
        out.println( new Date().toString() );
        
    }
    
}

