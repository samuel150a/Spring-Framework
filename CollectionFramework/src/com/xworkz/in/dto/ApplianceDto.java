package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ApplianceDto {
    private String domain;
    private String brand;
    private int rate;
    private boolean isCostEfficient;
    private String type;

}