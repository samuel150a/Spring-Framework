package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class PresidentDto {
    private String presidentName;
    private int preAge;
    private String qualification;
    private DriverDto driverDto;
}
