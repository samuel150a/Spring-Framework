package com.sports.sportslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Show7")
public class BaseBallServlet extends GenericServlet {
    public BaseBallServlet(){
        System.out.println("running in the BaseBallServelet constructor");

    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running in the BaseBall Class");
    }
}
