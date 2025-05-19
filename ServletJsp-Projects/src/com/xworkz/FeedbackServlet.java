package com.xworkz;

import co.dto.FeedbackDto;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns="/Feed")
public class FeedbackServlet extends HttpServlet {

    public FeedbackServlet()
    {
        System.out.println("Running in the FeedBackServlet constructor");
    }
    //@Override
    //public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


System.out.println("running in the post method");

        String name=req.getParameter("n");
         String college=req.getParameter("c");
        String webcourse=req.getParameter("cou");
        String knowl=req.getParameter("k");

        System.out.println(name);
        System.out.println(college);
        System.out.println(webcourse);
        System.out.println(knowl);



        req.setAttribute("n",name);
        req.setAttribute("c",college);
        req.setAttribute("cou",webcourse);
        req.setAttribute("k",knowl);

        FeedbackDto dto=new FeedbackDto();
        dto.setname(name);
        dto.setcollege(college);
        dto.setwebcourse(webcourse);
        dto.setknowl(knowl);


        req.setAttribute("dto",dto);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("SuccessFeedback.jsp");
        requestDispatcher.forward(req,resp);
    }
}
