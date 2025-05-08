package application;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/Book")
public class Bookings extends GenericServlet
 {


     @Override
     public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

         servletResponse.setContentType("text/html");
         PrintWriter writer = servletResponse.getWriter();




         String Name=servletRequest.getParameter("name");
         System.out.println("Received Name: " +Name);




         String Email=servletRequest.getParameter("email");
         System.out.println("Received email: " +Email);

         String Price=servletRequest.getParameter("price");
         System.out.println("Received price: " +Price);

         String Location=servletRequest.getParameter("location");
         System.out.println("Received location: " +Location);

         String MovieName=servletRequest.getParameter("moviename");
         System.out.println("Received MovieName: " +MovieName);

         String Time=servletRequest.getParameter("time");
         System.out.println("Received Time: " +Time);

         String Seat=servletRequest.getParameter("seat");
         System.out.println("Received SeatNo: " +Seat);

         if (Price.length()==0)
         {


             writer.println(Name + "Your Payment is Pending ");
         }
         else {
             writer.println(Name  + " Your Payment of " +Price +" is  SuccessFull ");
         }

     }
 }
