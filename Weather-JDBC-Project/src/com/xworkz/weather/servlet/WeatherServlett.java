package com.xworkz.weather.servlet;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.service.WeatherService;
import com.xworkz.weather.service.WeatherServiceImple;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns="/Wea")

public class WeatherServlett extends HttpServlet {
    public WeatherServlett() {
        System.out.println("Running in the WeatherServlet ");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post method in the weather Servlet");


        String plname = req.getParameter("plname");
        System.out.println(plname);

        String wename = req.getParameter("wename");
        System.out.println(wename);

        String miname = req.getParameter("miname");
        System.out.println(miname);

        String maname = req.getParameter("maname");
        System.out.println(maname);

        String clname = req.getParameter("clname");
        System.out.println(clname);

        String raname = req.getParameter("raname");
        System.out.println(raname);

        String rainame = req.getParameter("rainame");
        System.out.println(rainame);

        String huname = req.getParameter("huname");
        System.out.println(huname);

        String winame = req.getParameter("winame");
        System.out.println(winame);

        String suname = req.getParameter("suname");
        System.out.println(suname);

        String sunname = req.getParameter("sunname");
        System.out.println(sunname);

        String moname = req.getParameter("moname");
        System.out.println(moname);

        String mooname = req.getParameter("mooname");
        System.out.println(mooname);

        String tiname = req.getParameter("tiname");
        System.out.println(tiname);

        String timname = req.getParameter("timname");
        System.out.println(timname);

        String precname = req.getParameter("precname");
        System.out.println(precname);

        req.setAttribute("plname", plname);
        req.setAttribute("wename", wename);
        req.setAttribute("miname", miname);
        req.setAttribute("maname", maname);
        req.setAttribute("clname", clname);
        req.setAttribute("raname", raname);
        req.setAttribute("rainame", rainame);
        req.setAttribute("huname", huname);
        req.setAttribute("winame", winame);
        req.setAttribute("suname", suname);
        req.setAttribute("sunname", sunname);

        req.setAttribute("moname", moname);
        req.setAttribute("mooname", mooname);
        req.setAttribute("tiname", tiname);
        req.setAttribute("timname", timname);
        req.setAttribute("precname", precname);

        WeatherDto dto =new WeatherDto();
        dto.setplaceName(plname);
        dto.setweather(wename);
        dto.setminTemp(miname);
        dto.setmaxTemp(maname);

        dto.setcloudy(clname);
        dto.setraining(raname);
        dto.setrain(rainame);
        dto.sethumidity(huname);

        dto.setwindSpeed(winame);
        dto.setsunRiseTime(suname);
        dto.setsunSetTime(sunname);
        dto.setmoonRiseTime(moname);

        dto.setmoonSetTime(mooname);
        dto.setrainStartTime(tiname);
        dto.setrainEndTime(timname);
        dto.setprecipitation(precname);


        WeatherService service =new WeatherServiceImple();
        boolean saved =service.save(dto);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("weather.jsp");
        req.setAttribute("message", "Save is success");
        requestDispatcher.forward(req, resp);
        System.out.println("Successfull");

    }
}

