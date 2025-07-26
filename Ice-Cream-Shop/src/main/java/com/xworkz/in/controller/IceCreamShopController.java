package com.xworkz.in.controller;

import com.xworkz.in.dto.IceCreamShopDto;
import com.xworkz.in.service.IceCreamShopService;
import com.xworkz.in.service.IceCreamShopServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class IceCreamShopController {

    @Autowired
    private IceCreamShopService iceCreamShopService;

    public IceCreamShopController()
    {
        System.out.println("Running in the IceCreamShopController constructor");
    }

    @RequestMapping("/details")
    public String orderNow(IceCreamShopDto iceCreamShopDto, Model model) {
        System.out.println(iceCreamShopDto);

        if (iceCreamShopService.verify(iceCreamShopDto)) {
            System.out.println("Details valid");



            model.addAttribute("name", iceCreamShopDto.getName());

            double pri = iceCreamShopService.getPrice(iceCreamShopDto.getFlavour(), iceCreamShopDto.getQuantity());

            System.out.println("price: "+pri);
            model.addAttribute("price", pri);
            return "/OrderSuccess.jsp";

        } else {
            System.out.println("Invalid details");
            model.addAttribute("message", "Invalid details");
            return "/Order.jsp";
        }
    }


}
