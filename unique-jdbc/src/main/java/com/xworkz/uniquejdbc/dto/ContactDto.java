package com.xworkz.uniquejdbc.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class ContactDto {

    @NotBlank(message = "Please enter your name")
    @Size(min = 3, max = 30, message = "Name should be 3 to 30 characters")
    private String name;

    @NotBlank(message = "Please enter your email")
    @Email(message = "Enter a valid email address")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phoneNumber;

    @NotBlank(message = "Comments cannot be empty")
    @Size(min = 5, max = 200, message = "Comments should be between 5 and 200 characters")
    private String comments;
}
