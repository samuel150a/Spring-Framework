package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter

@AllArgsConstructor
public class ShirtDto {
    private int size;
    private String brand;
    private int price;
    private String type ;
    private String color;
}
