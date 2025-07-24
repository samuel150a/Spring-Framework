package com.xworkz.diary.controller;

import com.xworkz.diary.dto.FruitDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FruitController {
    public FruitController() {
        System.out.println("FruitController constructor");
    }
    @RequestMapping("/fruit")
    public String onFruit(FruitDto fruitDto,Model model)
    {
            System.out.println("fruit form method");
        model.addAttribute("fruitDto",fruitDto);
        return "/FruitResult.jsp";
    }
}
