package xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/Show")
public class FeedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("running");



        String name = servletRequest.getParameter("name");

        System.out.println("Received name: " + name);

        String email = servletRequest.getParameter("email");

        System.out.println("Received email: " + email);

        String contact = servletRequest.getParameter("contact");

        System.out.println("Received contact: " + contact);


        String feedback = servletRequest.getParameter("feedback");

        System.out.println("Received feedback: " + feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(name+" Thanks for the Feedback.");





    }
}
