package com.xworkz.task2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CustomerDto {

    private int cusId;
    private String cusName;
    private int age;
    private PasswordDto passwordDto;
}
