package com.xworkz;

import co.dto.FIRDto;
import co.dto.FirServiceImpl;
import co.service.FirService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Reg")


public class FirServlet extends HttpServlet {
    public FirServlet() {
        System.out.println("Running in the FirServlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post method in furniture Servlet");

        String pname = req.getParameter("pname");
        System.out.println(pname);

        String name = req.getParameter("name");
        System.out.println(name);

        String complaint = req.getParameter("complaint");
        System.out.println(complaint);
        String city = req.getParameter("city");
        System.out.println(city);
        String aadhar = req.getParameter("aadhar");
        System.out.println(aadhar);

        req.setAttribute("name",name);
        req.setAttribute("city",complaint);
        req.setAttribute("city",city);
        req.setAttribute("aadhar",aadhar);


        FIRDto dto = new FIRDto();






        FirService service = new FirServiceImpl();

        dto.setpname(pname);
        dto.setname(name);
        dto.setcomplaint(complaint);
        dto.setcity(city);
        dto.setaadhar(aadhar);


        boolean saved = service.save(dto);
      String Name=dto.getname();

        if (Name!=null && Name.length()>=4 && Name.length()<=20) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("SuccessFIR.jsp");
            req.setAttribute("dto", dto);

            requestDispatcher.forward(req, resp);
            System.out.println("Successfull");
        }

        else {

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("FIR.jsp");
            req.setAttribute("dto", dto);

            requestDispatcher.forward(req, resp);
            System.err.println("Name cant be null");
        }
    }
}