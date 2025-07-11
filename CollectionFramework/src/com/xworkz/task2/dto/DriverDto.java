package com.xworkz.task2.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class DriverDto {
    private  String driverName;
    private  String driverAge;
    private  int salary;
    private  VehicleDto vehicleDto;
}
