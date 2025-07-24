package com.xworkz.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PoliceStationController {
    public PoliceStationController()
    {
        System.out.println("PoliceStationController constructor");
    }

    @RequestMapping("/policeStation")
    public String onPoliceStation(@RequestParam String stationName,@RequestParam String area,@RequestParam String inspector,@RequestParam String telephoneNo,
                                  @RequestParam String state,@RequestParam int geepNo,@RequestParam int totalCell,@RequestParam String victim,
                                  @RequestParam String complaintType,@RequestParam String investigationPet, Model model)
    {
        System.out.println("PoliceStation form method");

        System.out.println("Station Name: "+stationName);
        System.out.println("Area: "+area);
        System.out.println("Inspector: "+inspector);
        System.out.println("TelephoneNo: "+telephoneNo);
        System.out.println("State: "+state);
        System.out.println("GeepNo:" +geepNo);
        System.out.println("TotalCell: "+totalCell);
        System.out.println("Victim: "+victim);
        System.out.println("ComplaintType: "+complaintType);
        System.out.println("InvestigationPet: "+investigationPet);

        model.addAttribute("stationName",stationName);
        model.addAttribute("area",area);
        model.addAttribute("inspector",inspector);
        model.addAttribute("telephoneNo",telephoneNo);
        model.addAttribute("state",state);
        model.addAttribute("geepNo",geepNo);
        model.addAttribute("totalCell",totalCell);
        model.addAttribute("victim",victim);
        model.addAttribute("complaintType",complaintType);
        model.addAttribute("investigationPet",investigationPet);

        return "/PoliceStationResult.jsp";
    }
}