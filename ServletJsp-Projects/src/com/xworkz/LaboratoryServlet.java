package com.xworkz;

import co.dto.DonationDto;
import co.dto.LaboratoryDto;
import co.dto.LaboratoryServiceImple;
import co.service.LaboratoryService;

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

        String name=req.getParameter("name");
        String age=req.getParameter("age");
        String bloodgroup=req.getParameter("bloodgroup");
        String bloodpressure=req.getParameter("bloodpressure");


        System.out.println(name);
        System.out.println(age);
        System.out.println(bloodgroup);
        System.out.println(bloodpressure);

        req.setAttribute("name",name);
        req.setAttribute("age",age);
        req.setAttribute("bloodgroup",bloodgroup);
        req.setAttribute("bloodpressure",bloodpressure);

        LaboratoryDto dto=new LaboratoryDto();
        dto.setname(name);

        dto.setage(age);
        dto.setbloodgroup(bloodgroup);
        dto.setbloodpressure(bloodpressure);

        LaboratoryService service=new LaboratoryServiceImple();
        boolean saved=service.save( dto);







        if(saved) {
            req.setAttribute("dto", dto);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("SuccessLaboratory.jsp");
            requestDispatcher.forward(req, resp);
        }
        else {
            req.setAttribute("dto", dto);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Laboratory.jsp");
            requestDispatcher.forward(req, resp);
        }



    }
}
