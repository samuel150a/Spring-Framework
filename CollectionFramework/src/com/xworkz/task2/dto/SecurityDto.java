package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class SecurityDto {
    private int securityAge;
    private int securityExperience;
    private JobDto jobDto;
}
