package com.sports.sportslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Show5")
public class Kabbadi extends GenericServlet {
    public Kabbadi()
    {
        System.out.println("running in the Kabbadi constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running in the Class Kabbadi");
    }
}
