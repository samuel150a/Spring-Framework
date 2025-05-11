package com.hosp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/appoi")
public class Hospital extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String firstname=servletRequest.getParameter("firstname");
        String lastname=servletRequest.getParameter("lastname");
        String age=servletRequest.getParameter("age");
        String email=servletRequest.getParameter("email");
        String address=servletRequest.getParameter("address");
        String gender=servletRequest.getParameter("gender");
        String sickness=servletRequest.getParameter("sickness");
        String phonenum=servletRequest.getParameter("phonenum");

        servletResponse.setContentType("text/html");

        PrintWriter writer=servletResponse.getWriter();

        writer.println(firstname);
        writer.println(lastname);
        writer.println(age);
        writer.println(email);
        writer.println(address);
        writer.println(gender);
        writer.println(sickness);
        writer.println(gender);

    }
}
