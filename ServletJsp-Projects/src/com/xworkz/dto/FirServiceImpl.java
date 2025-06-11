package com.xworkz.dto;

import com.xworkz.repository.FirRepository;
import com.xworkz.repository.FirRepositoryImpl;
import com.xworkz.service.FirService;

public class FirServiceImpl  implements FirService {
    public FirServiceImpl() {

        System.out.println("Running in the implements constructor");
    }

    @Override
    public boolean save(FIRDto firDto) {
        System.out.println("save method in Fur impl Class");
        FirRepository firRepository = new FirRepositoryImpl();
        return firRepository.persist(firDto);
    }
}