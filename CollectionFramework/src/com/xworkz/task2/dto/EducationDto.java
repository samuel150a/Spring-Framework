package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class EducationDto {
    private int cgpa;
    private int year;
    private int fee;
    private String college;
}
