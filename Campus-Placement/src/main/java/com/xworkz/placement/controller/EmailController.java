package com.xworkz.placement.controller;

import com.xworkz.placement.service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/")
public class EmailController {
    @Autowired
    EmailSender emailSender;

    @PostMapping("/sendEmail")
    private String sendEmail(String name){
        System.out.println("hitting controller");
        emailSender.mailSender("samueldrakson184@gmail.com","123456");
        System.out.println("hlo");
        return "success.jsp";
    }



}
