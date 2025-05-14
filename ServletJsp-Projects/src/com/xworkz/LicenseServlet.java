package com.xworkz;

import sun.awt.geom.AreaOp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/L")

public class LicenseServlet  extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String sonof=servletRequest.getParameter("s");
        String dob=servletRequest.getParameter("d");
        String Photo=servletRequest.getParameter("p");

        System.out.println(name);
        System.out.println(sonof);
        System.out.println(dob);
        System.out.println(Photo);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("SuccessLicense.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
