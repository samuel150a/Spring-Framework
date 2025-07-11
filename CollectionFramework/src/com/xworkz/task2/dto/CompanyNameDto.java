package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CompanyNameDto {
    private String Name;
    private int empl;
    private int seniorEmpl;
    private CeoDto ceoDto;
}
