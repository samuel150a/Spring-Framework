package co.repository;

import co.dto.FIRDto;

public class FirRepositoryImpl implements  FirRepository{



    public FirRepositoryImpl()
    {
        System.out.println("FirRepositoryImpl constructor");
    }
    @Override
    public boolean persist(FIRDto firDto) {

        System.out.println(" persist method in FirRepositoryImpl");
        return true;
    }
}
