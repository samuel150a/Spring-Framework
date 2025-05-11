package com.hosp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns ="/Call")
public class ContHosp extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String firstname=servletRequest.getParameter("firstname");
        String lastname=servletRequest.getParameter("lastname");
        String message=servletRequest.getParameter("message");
        String email=servletRequest.getParameter("email");

        servletResponse.setContentType("text/html");

        PrintWriter writer=servletResponse.getWriter();

        writer.println(firstname);
        writer.println(lastname);
        writer.println(message);
        writer.println(email);

    }
}
