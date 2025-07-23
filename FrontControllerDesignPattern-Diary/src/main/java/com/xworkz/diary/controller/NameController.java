package com.xworkz.diary.controller;

import com.xworkz.diary.dto.NameDto;
import com.xworkz.diary.dto.RTODto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NameController
{
    public NameController()
    {
        System.out.println("NameController Constructor");
    }

    @RequestMapping("/name")
    public String Idisplay(NameDto nameDto,Model model)
    {

        System.out.println(nameDto);
        model.addAttribute("nameDto",nameDto);
       /* System.out.println("Name form method");
        System.out.println("First Name: "+firstName);
        System.out.println("Middle Name: "+middleName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Display Name: "+displayName);

        model.addAttribute("firstName",firstName);
        model.addAttribute("lastName",lastName);
        model.addAttribute("middleName",middleName);
        model.addAttribute("displayName",displayName);*/

        return "/NameResult.jsp";

    }
}
