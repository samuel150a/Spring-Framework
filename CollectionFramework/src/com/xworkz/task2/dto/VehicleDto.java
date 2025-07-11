package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class VehicleDto {
    private int vehicleNum;
    private int vechicleType;
    private int vecCost;
    private CountryDto countryDto;
}
