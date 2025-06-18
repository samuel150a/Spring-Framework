package com.xworkz.piano.servlet;

import com.xworkz.piano.service.PianoServiceImple;
import com.xworkz.piano.dto.PianoDto;
import com.xworkz.piano.service.PianoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns="/Piano")

public class PianoServlet extends HttpServlet {
    public PianoServlet() {
        System.out.println("Running in the PianoServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post method in the Piano Servlet ");

        String cname = req.getParameter("cname");
        System.out.println(cname);


        String mname = req.getParameter("mname");
        System.out.println(mname);

        String kname = req.getParameter("kname");
        System.out.println(kname);


        String pname = req.getParameter("pname");
        System.out.println(pname);

        String msname = req.getParameter("msname");
        System.out.println(msname);

        String mfname = req.getParameter("mfname");
        System.out.println(mfname);




        PianoDto dto = new PianoDto(cname,mname,kname,pname,msname,mfname);


        PianoService service = new PianoServiceImple();
        boolean saved = service.save(dto);
        if(saved){
            System.out.println("service done successfully");
            req.setAttribute("success","Piano Details Saved Successfully");
        }
        else{
            System.out.println("not saved");
            req.setAttribute("dto",dto);
            req.setAttribute("failure","Piano Details not saved Successfully");
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Piano.jsp");


        requestDispatcher.forward(req, resp);
        System.out.println("Successfull");
    }


        @Override
                protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {
            System.out.println("doGet method in Piano Servlet ");
            String PianoIdStr=req.getParameter("PianoId");
            if(!(PianoIdStr == null && PianoIdStr.isEmpty()))
            {
                int PianoId=Integer.parseInt(PianoIdStr);
                PianoService service = new PianoServiceImple();

                Optional<PianoDto> optionalPianoDto=service.findById(PianoId);
                if(optionalPianoDto.isPresent()) {
                    System.out.println("Piano Id is found");
                }
                else {
                    System.out.println("Piano Id is not found");


                }
                }

            }

        }


