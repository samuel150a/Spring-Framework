package com.xworkz.placement.controller;

import com.xworkz.placement.dto.PlacementDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class PlacementController {

    public PlacementController() {
        System.out.println("PlacementController constructor");
    }
    @GetMapping("/order")
    public String showForm(Model model) {
        model.addAttribute("dto", new PlacementDto());
        return "/Order.jsp";
    }

    @PostMapping("/order")
    public String onOrder(@Valid @ModelAttribute("dto") PlacementDto placementDto,
                          BindingResult bindingResult,
                          Model model) {

        System.out.println("Placement form submitted");
        System.out.println("Placement Details: " + placementDto);

        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors().forEach(error ->
                    System.out.println(error.getField() + " : " + error.getDefaultMessage())
            );
            model.addAttribute("dto", placementDto);
            model.addAttribute("message", "Invalid details");
            return "/Order.jsp";
        }

        try {
            byte[] bytes = placementDto.getMultipartFile().getBytes();
            String originalFileName = placementDto.getMultipartFile().getOriginalFilename();
            Path path = Paths.get("D:\\savefile\\" + originalFileName);
            Files.write(path, bytes);

            model.addAttribute("fileSaved", "File saved successfully!");
            model.addAttribute("fileName", originalFileName);

        } catch (IOException e) {
            System.out.println("File upload failed: " + e.getMessage());
            model.addAttribute("fileSaved", "File upload failed!");
            model.addAttribute("fileName", "N/A");
        }

        model.addAttribute("name", placementDto.getName());

        return "/OrderSuccess.jsp";

    }


}
