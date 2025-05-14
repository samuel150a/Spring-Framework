package org;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns="/Do")
public class Donation extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");

        System.out.println("Received name: " + name);

        String email = servletRequest.getParameter("email");

        System.out.println("Received email: " + email);


        String amount = servletRequest.getParameter("amount");

        System.out.println("Received amount: " + amount);

        String org = servletRequest.getParameter("org");

        System.out.println("Received org: " + org);

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("DonationSuccess.jsp");

        requestDispatcher.forward(servletRequest,servletResponse);


    }
    }



