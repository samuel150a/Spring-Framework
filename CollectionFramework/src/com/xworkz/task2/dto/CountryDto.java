package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CountryDto {
    private String name;
    private String population;
    private String capital;
    private PresidentDto presidentDto;
}
