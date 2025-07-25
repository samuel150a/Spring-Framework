package com.xworkz.in.controller;

import com.xworkz.in.dto.IceCreamShopDto;
import com.xworkz.in.service.IceCreamShopService;
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

    public IceCreamShopController() {
        System.out.println("Running in the IceCreamShopController constructor");
    }

    @RequestMapping("/details")
    public String orderNow(IceCreamShopDto iceCreamShopDto, Model model) {
        System.out.println(iceCreamShopDto);

        if (iceCreamShopService.verify(iceCreamShopDto)) {
            model.addAttribute("name", iceCreamShopDto.getName());
            model.addAttribute("price", getPrice(iceCreamShopDto.getFlavour()));
            return "/OrderSuccess.jsp";
        } else {
            System.out.println("Invalid details");
            model.addAttribute("message", "Invalid details");
            return "Order.jsp";
        }
    }

    public double getPrice(String flavour) {
        Map<String, Double> price = new HashMap<>();
        price.put("Pista", 40d);
        price.put("Chocolate", 41d);
        price.put("Vanilla", 42d);
        price.put("Oreo", 43d);
        price.put("Grapes", 44d);

        return price.get(flavour);
    }
}
