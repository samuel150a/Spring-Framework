package com.xworkz.olympic.servlet;


import com.xworkz.olympic.dto.OlympicDto;
import com.xworkz.olympic.service.OlympicService;
import com.xworkz.olympic.service.OlympicServiceImple;
import lombok.SneakyThrows;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns="/Op")
public class OlympicServlet extends HttpServlet

{
    public OlympicServlet()
    {
        System.out.println("running in OlympicServlet constructor ");
    }

    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        System.out.println("Post method in the OlympicServlet  ");
        String memberName = req.getParameter("memberName");
        String dob = req.getParameter("dob");
        String gender = req.getParameter("gender");
        String phone = req.getParameter("phone");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String sport = req.getParameter("sport");


        OlympicDto dto = new OlympicDto(memberName,dob,gender,phone,state,city,sport);

        OlympicService service = new OlympicServiceImple();
        boolean saved = service.save(dto);

        if (saved) {
            System.out.println("service done successfully");
            req.setAttribute("success", "OLympicRegistration Details Saved Successfully");
        } else {
            System.out.println("not saved");
            req.setAttribute("dto", dto);
            req.setAttribute("failure", "OlympicRegistration Details not Saved Successfully");


        }


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Olympic.jsp");

        requestDispatcher.forward(req, resp);
        System.out.println("Successfull");
        System.out.println("########################################################################");
    }
        @SneakyThrows
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {
            System.out.println("doGet method in olympics Servlet ");
            String OlympicIdStr=req.getParameter("id");
            if(OlympicIdStr != null && !OlympicIdStr.isEmpty())
            {
                int OlympicId=Integer.parseInt(OlympicIdStr);
                OlympicService service = new OlympicServiceImple();

                Optional<OlympicDto> optionalOlympicDto=service.findById(OlympicId);
                if(optionalOlympicDto.isPresent()) {
                    System.out.println("Olympic Id is found");
                    OlympicDto olympicDto=optionalOlympicDto.get();
                    System.out.println("Data was found "+olympicDto);
                    System.out.println("================================================================");

                    req.setAttribute("dto", olympicDto);
                }

                else {
                    System.out.println("Olympic Id is not found");
                    req.setAttribute("failure", "Olympic ID not found");

                }

            RequestDispatcher Dispatcher = req.getRequestDispatcher("OlympicCandidentDetails.jsp");
            Dispatcher.forward(req,resp);

        }
    }
}
