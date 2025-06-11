package com.xworkz.repository;

import com.xworkz.dto.FIRDto;

public interface FirRepository {

    boolean persist(FIRDto firDto);
}
