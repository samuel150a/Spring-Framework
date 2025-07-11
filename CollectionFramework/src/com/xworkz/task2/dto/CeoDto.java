package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CeoDto
{
    private String ceoName;
    private int ceoAge;
    private int ceoExperience;
    private HouseDto houseDto;
}
