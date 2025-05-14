package com.xworkz;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns="/Feed")
public class FeedbackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("n");
         String college=servletRequest.getParameter("c");
        String webcourse=servletRequest.getParameter("cou");
        String knowl=servletRequest.getParameter("k");

        System.out.println(name);
        System.out.println(college);
        System.out.println(webcourse);
        System.out.println(knowl);


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("SuccessFeedback.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
