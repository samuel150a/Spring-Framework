package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class VendorDto
{
    private String name;
    private int gstNo;
    private LocalDate establishedDate;

}
