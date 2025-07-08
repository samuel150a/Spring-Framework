package com.xworkz.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//
@ToString
@Getter
@Setter
@AllArgsConstructor
public class AddressDto {
    private int no;
    private String street;
    private String city;
    private int pincode;


}
