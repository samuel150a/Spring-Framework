package com.xworkz.in.runner;

import com.xworkz.in.dto.AddressDto;
import com.xworkz.in.dto.PersonDto;
import com.xworkz.in.repository.PersonAddressRepository;
import com.xworkz.in.repository.PersonAddressRepositoryImple;

import java.util.Map;
import java.util.Set;

public class PersonAddressRunner {
    public static void main(String[] args) {
        PersonAddressRepository personAddressRepository =new PersonAddressRepositoryImple();
        Map<PersonDto, AddressDto> map =personAddressRepository.findAll();

        System.out.println("The Details of Person Address");




        /*map.keySet().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       map.values().forEach(System.out::println);
*/
        /*Set<Map.Entry<PersonDto,AddressDto>> entry=map.entrySet();
        entry.forEach(e->System.out.println(e.getKey()+""+e.getValue()));*/
        Set<Map.Entry<PersonDto,AddressDto>> entry=map.entrySet();

        entry.forEach(e->{

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });

      }


}
