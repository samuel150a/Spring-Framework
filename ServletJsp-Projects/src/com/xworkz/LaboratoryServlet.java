package com.xworkz;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/Lab")
public class LaboratoryServlet extends HttpServlet {

    public LaboratoryServlet()
    {
        System.out.println("Running in the LabaratoryServlet Constructor");
    }



    //@Override
    //public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("Running in the post method");

        String pname=req.getParameter("name");
        String age=req.getParameter("age");
        String bg=req.getParameter("g");
        String bp=req.getParameter("p");


        System.out.println(pname);
        System.out.println(age);
        System.out.println(bg);
        System.out.println(bp);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("SuccessLaboratory.jsp");

        req.setAttribute("name",pname);
        req.setAttribute("age",age);
        req.setAttribute("g",bg);
        req.setAttribute("p",bp);

        requestDispatcher.forward(req,resp);

    }
}
