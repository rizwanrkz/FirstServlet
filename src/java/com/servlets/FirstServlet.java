/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Rizwan.Rkz
 */
public class FirstServlet implements Servlet {
    
    ServletConfig conf;
    
    /**
     *
     * @param conf
     */
    @Override
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Creating Object.....");
    }
    
    @Override
    public void destroy(){
        System.out.println("Destroying resources......");
    }
    
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    @Override
    public String getServletInfo(){
        return "this servlet is created by Syed Rizwan";
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       System.out.println("this servlet is created by implementing Servlet Interface");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my first servlet created by implementing Servlet Interface</h1>");
    }

   
    

   
    
}
