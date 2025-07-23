package com.xworkz.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HospitalController {
    public HospitalController()
    {
        System.out.println("HospitalController constructor");
    }

    @RequestMapping("/hospital")
    public String sHospital(@RequestParam String hospitalName , @RequestParam String patientName, @RequestParam int age,
                             @RequestParam String disability, @RequestParam int mobile, @RequestParam String type, Model model)
    {
        System.out.println("Hospital form method");

        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("PatientName: "+patientName);
        System.out.println("Age: "+age);
        System.out.println("Disability: "+disability);
        System.out.println("Mobile: "+mobile);
        System.out.println("Type: "+type);

        model.addAttribute("hospitalName",hospitalName);
        model.addAttribute("patientName",patientName);
        model.addAttribute("age",age);
        model.addAttribute("disability",disability);
        model.addAttribute("mobile",mobile);
        model.addAttribute("type",type);

        return "/HospitalResult.jsp";
    }
}