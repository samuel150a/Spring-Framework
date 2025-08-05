package com.xworkz.uniquejdbc.controller;

import com.xworkz.uniquejdbc.dto.ContactDto;
import com.xworkz.uniquejdbc.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class ContactController {

    @Autowired
    private ContactService contactService;

    public ContactController() {}

    @RequestMapping("/contact")
    public String getContact(@Valid ContactDto contactDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("message", "Invalid details");
            return "Contact";
        }

        if (contactService.validate(contactDTO)) {
            model.addAttribute("contactDTO", contactDTO);
            return "ContactSuccess";
        } else {
            model.addAttribute("message", "Something went wrong");
            return "Contact";
        }
    }
}
