package com.xworkz.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RTOController {
    public RTOController()
    {
        System.out.println("RTOController constructor");
    }

    @RequestMapping("/rto")
    public String onRTO(@RequestParam String officeName, @RequestParam String address, @RequestParam String owner,
                        @RequestParam int age, @RequestParam String sonOf, @RequestParam String vehicle, Model model)
    {
        System.out.println("RTO form method ");

        System.out.println("Office Name: "+officeName);
        System.out.println("Address: "+address);
        System.out.println("Owner: "+owner);
        System.out.println("Age: "+age);
        System.out.println("SonOf: "+sonOf);
        System.out.println("Vehicle : "+vehicle);

        model.addAttribute("officeName",officeName);
        model.addAttribute("address",address);
        model.addAttribute("owner",owner);
        model.addAttribute("age",age);
        model.addAttribute("sonOf",sonOf);
        model.addAttribute("vehicle",vehicle);

        return "/RTOResult.jsp";
    }
}