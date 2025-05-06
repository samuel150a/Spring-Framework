package com.sports.sportslist;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns="/Show")
public class CricketServlet extends GenericServlet {
    public CricketServlet()
    {
        System.out.println("Running in the CricketServlet constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running in the Cricket Servlet");
    }
}
