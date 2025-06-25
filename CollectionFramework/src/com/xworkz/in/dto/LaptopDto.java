package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class LaptopDto {
    private int cost;
    private String brand;
    private String color;
    private boolean istouchDisplay;
    private String proccessor;


}
