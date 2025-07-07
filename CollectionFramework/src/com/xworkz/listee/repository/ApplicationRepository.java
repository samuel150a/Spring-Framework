package com.xworkz.listee.repository;

import com.xworkz.listee.dto.ApplicationDto;

import java.util.Collection;
import java.util.List;

public interface ApplicationRepository

{
    List<ApplicationDto> findAll();

}
