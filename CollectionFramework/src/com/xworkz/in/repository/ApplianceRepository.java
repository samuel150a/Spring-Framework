package com.xworkz.in.repository;

import com.xworkz.in.dto.ApplianceDto;

import java.util.Collection;

public interface ApplianceRepository {

    Collection<ApplianceDto> findAll();
}
