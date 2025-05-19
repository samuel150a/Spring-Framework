package com.xworkz;

import co.dto.FIRDto;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

        String complaint=req.getParameter("complaint");
        System.out.println(complaint);
        String city=req.getParameter("city");
        System.out.println(city);
        String aadhar=req.getParameter("aadhar");
        System.out.println(aadhar);

        FIRDto dto=new FIRDto();

        dto.setpname(pname);
        dto.setname(name);
        dto.setcomplaint(complaint);
        dto.setcity(city);
        dto.setaadhar(aadhar);


        req.setAttribute("dto",dto);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("SuccessFIR.jsp");
        requestDispatcher.forward(req,resp);
    }
}