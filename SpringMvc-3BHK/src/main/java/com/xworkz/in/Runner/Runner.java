package com.xworkz.in.Runner;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*dvd1 1 1        */
@Controller
@RequestMapping("/")
public class Runner {

    public Runner()
    {
        System.out.println("runnning in the runner constructor");
    }
    @RequestMapping("/Open")

    public String Price()
    {
        System.out.println(" 3-BHK rent is 40000");
        return "/Success.jsp";
    }



}
