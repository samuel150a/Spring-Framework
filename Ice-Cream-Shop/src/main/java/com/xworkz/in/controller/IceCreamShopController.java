package com.xworkz.in.controller;

import com.xworkz.in.dto.IceCreamShopDto;
import com.xworkz.in.service.IceCreamShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

            double basePrice = iceCreamShopService.getPrice(iceCreamShopDto.getFlavour(), iceCreamShopDto.getQuantity());
            double finalPrice = iceCreamShopService.getDiscountedPrice(iceCreamShopDto);
            double discountAmount = basePrice - finalPrice;

            model.addAttribute("name", iceCreamShopDto.getName());
            model.addAttribute("basePrice", basePrice);
            model.addAttribute("discount", discountAmount);
            model.addAttribute("price", finalPrice);



            return "OrderSuccess";

        } else {
            System.out.println("Invalid details");
            model.addAttribute("message", "Invalid details");
            return "Order";
        }

        }

    }

