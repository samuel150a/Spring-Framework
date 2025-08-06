package com.xworkz.placement.controller;

import com.xworkz.placement.dto.PlacementDto;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class PlacementController {

    public PlacementController() {
        System.out.println("PlacementController constructor");
    }

    @GetMapping("/demo")
    public String showDemo(Model model) {
        return "demo";
    }

    @GetMapping("/order")
    public String showForm(Model model) {
        model.addAttribute("dto", new PlacementDto());
        return "Order";
    }

    @PostMapping("/order")
    public String onOrder(@Valid @ModelAttribute("dto") PlacementDto placementDto,
                          BindingResult bindingResult,
                          Model model) {

        System.out.println("Placement form submitted");
        System.out.println("Placement Details: " + placementDto);

        String originalFileName = null;

        if (bindingResult.hasErrors()) {
            model.addAttribute("dto", placementDto);
            model.addAttribute("message", "Invalid details");
            return "Order";
        }

        try {
            byte[] bytes = placementDto.getMultipartFile().getBytes();
            originalFileName = placementDto.getMultipartFile().getOriginalFilename();
            Path path = Paths.get("D:\\savefile\\" + originalFileName);
            Files.write(path, bytes);

            model.addAttribute("fileSaved", "File saved successfully!");
            model.addAttribute("fileName", originalFileName);
            model.addAttribute("originalFileName", originalFileName);

        } catch (IOException e) {
            System.out.println("File upload failed: " + e.getMessage());
            model.addAttribute("fileSaved", "File upload failed!");
            model.addAttribute("fileName", "N/A");
        }

        model.addAttribute("name", placementDto.getName());
        return "OrderSuccess";
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response, @RequestParam("profile") String profile) throws IOException {
        response.setContentType("image/jpeg");
        File file = new File("D:\\savefile\\" + profile);

        if (!file.exists()) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        try (InputStream in = new BufferedInputStream(new FileInputStream(file));
             ServletOutputStream out = response.getOutputStream()) {
            IOUtils.copy(in, out);
            response.flushBuffer();
        }
    }
}
