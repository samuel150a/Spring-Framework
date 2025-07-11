package com.xworkz.task2.runner;


import com.xworkz.task2.dataimple.CustomerList;
import com.xworkz.task2.dto.CustomerDto;
import com.xworkz.task2.dto.JobDto;

import java.util.Comparator;
import java.util.List;

public class CustomerRunner {

    public static void main(String[] args) {

        CustomerList customerDto = new CustomerList();
        List<CustomerDto> customerList = customerDto.getCustomerList();

        System.out.println("===========================================");
        System.out.println("Sort the customers by name in descending order");
        customerList.stream()
                .sorted(Comparator.comparing(CustomerDto::getCusName).reversed())
                .forEach(e -> System.out.println(e.getCusName()));

        System.out.println("===========================================");
        System.out.println("Find a customer by job role = 'Backend Developer'");
        customerList.stream()
                .filter(customerDTO -> {
                    JobDto jobDto = customerDTO.getPasswordDto()
                            .getCountryDto()
                            .getPresidentDto()
                            .getDriverDto()
                            .getVehicleDto()
                            .getCompanyNameDto()
                            .getCeoDto()
                            .getHouseDto()
                            .getSecurityDto()
                            .getJobDto();
                    return jobDto.getRole().equalsIgnoreCase("Developer");
                })
                .forEach(customerDTO -> System.out.println(customerDTO.getCusName()));

        System.out.println("===========================================");
        System.out.println("Sort by Country name in descending order");
        customerList.stream().sorted(Comparator.comparing(
                        customerDTO -> customerDTO.getPasswordDto().getCountryDto().getName(),
                        Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getPasswordDto().getCountryDto().getName()));

        System.out.println("===========================================");
        System.out.println("Sort by Education college  in ascending order");
        customerList.stream()
                .sorted(Comparator.comparing(
                        customerDTO -> customerDTO.getPasswordDto()
                                .getCountryDto()
                                .getPresidentDto()
                                .getDriverDto()
                                .getVehicleDto()
                                .getCompanyNameDto()
                                .getCeoDto()
                                .getHouseDto()
                                .getSecurityDto()
                                .getJobDto()
                                .getDetailsDto()
                                .getEducationDto()
                                .getCollege(),
                        Comparator.naturalOrder()))
                .forEach(customerDTO -> System.out.println(
                        customerDTO.getPasswordDto()
                                .getCountryDto()
                                .getPresidentDto()
                                .getDriverDto()
                                .getVehicleDto()
                                .getCompanyNameDto()
                                .getCeoDto()
                                .getHouseDto()
                                .getSecurityDto()
                                .getJobDto()
                                .getDetailsDto()
                                .getEducationDto()
                                .getCollege()));

        System.out.println("============================================ ");
        System.out.println("Collect and display all unique country names");
        customerList.stream()
                .map(customerDTO -> customerDTO.getPasswordDto().getCountryDto().getName())
                .distinct()
                .forEach(System.out::println);
    }
}
