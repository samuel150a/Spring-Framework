package com.xworkz.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class PoliceStationDto {

    private String  RTOOfficeName;
    private String Address;
    private String Owner;
    private int Age;
    private String SonOf;
    private String Vehicle;
}
