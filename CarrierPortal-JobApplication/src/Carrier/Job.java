package Carrier;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/Apply")
public class Job extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        String Name=servletRequest.getParameter("name");
        System.out.println("Received Name: " +Name);




        String Email=servletRequest.getParameter("email");
        System.out.println("Received email: " +Email);

        String Qualification=servletRequest.getParameter("qualification");
        System.out.println("Received price: " +Qualification);

        String Location=servletRequest.getParameter("location");
        System.out.println("Received location: " +Location);

        String Cgpa=servletRequest.getParameter("cgpa");
        System.out.println("Received MovieName: " +Cgpa);

        String Experience=servletRequest.getParameter("experience");
        System.out.println("Received Time: " +Experience);

        String Role=servletRequest.getParameter("role");
        System.out.println("Received SeatNo: " +Role);



        writer.println(Name + " Your Registration is Successfull we will inform You Shortly! ");

    }
}
