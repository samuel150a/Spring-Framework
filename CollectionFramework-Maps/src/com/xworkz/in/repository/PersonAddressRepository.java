package com.xworkz.in.repository;

import com.xworkz.in.dto.AddressDto;
import com.xworkz.in.dto.PersonDto;

import java.util.Map;

public interface PersonAddressRepository {
    Map<PersonDto, AddressDto> findAll();
}
