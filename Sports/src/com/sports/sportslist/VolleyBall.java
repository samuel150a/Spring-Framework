package com.sports.sportslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Show4")
public class VolleyBall extends GenericServlet {
    public VolleyBall()
    {
        System.out.println("Running in the VolleyBall Constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running in the class VolleyBall");
    }
}
