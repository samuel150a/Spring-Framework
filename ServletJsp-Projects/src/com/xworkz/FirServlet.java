package com.xworkz;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;






import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns="/Reg")


public class FirServlet extends HttpServlet

{
    public FirServlet(){
        System.out.println("Running in the FirServlet constructor");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Post method in furniture Servlet");

        String pname=req.getParameter("pname");
        System.out.println(pname);

        String name=req.getParameter("name");
        System.out.println(name);
        String Complaint=req.getParameter("sub");
        System.out.println(Complaint);
        String city=req.getParameter("city");
        System.out.println(city);
        String Aadhar=req.getParameter("proof");
        System.out.println(Aadhar);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("SuccessFIR.jsp");
        req.setAttribute("pname",pname);
        req.setAttribute("name",name);
        req.setAttribute("sub",Complaint);
        req.setAttribute("city",city);
        req.setAttribute("proof",Aadhar);


        requestDispatcher.forward(req,resp);
    }
}