package com.xworkz.in.runner;

import com.xworkz.in.dto.AddressDto;
import com.xworkz.in.dto.PersonDto;
import com.xworkz.in.repository.PersonAddressRepository;
import com.xworkz.in.repository.PersonAddressRepositoryImple;

import java.util.Map;

public class PersonAddressRunner {
    public static void main(String[] args) {
        PersonAddressRepository personAddressRepository =new PersonAddressRepositoryImple();
        Map<PersonDto, AddressDto> map =personAddressRepository.findAll();

        System.out.println("The Details of Person Address");




        map.keySet().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       map.values().forEach(System.out::println);



      }


}
