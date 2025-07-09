package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class BrandDto {
    private String company;
    private Integer Price;
    private String Madein;
    private  String Accessories;

}
