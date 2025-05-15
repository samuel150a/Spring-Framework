package com.xworkz;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns="/Do")
public class DonationServlet extends HttpServlet {


    public DonationServlet()
    {
        System.out.println("Running in the constructor called DonationServlet");
    }
   // @Override
    //public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {//
        @Override
           protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {

    System.out.println("Running in the Post method");
    String name = req.getParameter("name");

        System.out.println("Received name: " + name);

        String email = req.getParameter("email");

        System.out.println("Received email: " + email);


        String amount = req.getParameter("amount");

        System.out.println("Received amount: " + amount);

        String org = req.getParameter("org");

        System.out.println("Received org: " + org);

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("SuccessDonation.jsp");
            req.setAttribute("name",name);
            req.setAttribute("email",email);
            req.setAttribute("amount",amount);
            req.setAttribute("org",org);
        requestDispatcher.forward(req,resp);


    }
}



