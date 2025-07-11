package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class JobDto
{
    private String role;
    private String department;
    private int salary;
    private  DetailsDto detailsDto;
}
