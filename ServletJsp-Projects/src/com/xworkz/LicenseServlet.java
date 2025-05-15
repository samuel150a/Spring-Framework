package com.xworkz;

import sun.awt.geom.AreaOp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/L")

public class LicenseServlet  extends HttpServlet {
    public LicenseServlet() {

        System.out.println("Running in the License Constructor");
    }
    //@Override
    //public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Running in the Post method");
    String name=req.getParameter("name");
        String sonof=req.getParameter("s");
        String dob=req.getParameter("d");
        String Photo=req.getParameter("p");

        System.out.println(name);
        System.out.println(sonof);
        System.out.println(dob);
        System.out.println(Photo);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("SuccessLicense.jsp");


        req.setAttribute("name",name);
        req.setAttribute("s",sonof);
        req.setAttribute("d",dob);
        req.setAttribute("p",Photo);
        requestDispatcher.forward(req,resp);
    }
}
