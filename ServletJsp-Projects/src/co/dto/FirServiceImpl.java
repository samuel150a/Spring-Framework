package co.dto;

import co.repository.FirRepository;
import co.repository.FirRepositoryImpl;
import co.service.FirService;

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