package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class HouseDto {
    private int houseNum;
    private int houseRent;
    private String houdeOwner;
    private SecurityDto securityDto;
}
