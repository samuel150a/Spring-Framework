package com.xworkz.placement.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class PlacementDto {

    @NotBlank
    @Size(min = 3, max = 30)
    private String name;

    @NotBlank
    @Email
    private String email;

    private MultipartFile multipartFile;
}
