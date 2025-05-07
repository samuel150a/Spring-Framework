package AadharServlet;



import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = "/ValidateAadhaar")
public class Aadhar extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String aadhaar = servletRequest.getParameter("num");

        System.out.println("Received Aadhaar number: " + aadhaar);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        if (aadhaar.length()==12) {
            writer.println(aadhaar+" you have entered Correct aadhar number");
        } else {
            writer.println(aadhaar+" you have entered Wrong aadhar number");
        }
    }
}
