package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class PasswordDto {
    private String type;
    private boolean specialcase;
    private int pasSize;
    private CountryDto countryDto;

}
