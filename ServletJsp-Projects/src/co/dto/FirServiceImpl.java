package co.dto;

import co.service.FirService;

public class FirServiceImpl  implements FirService {
    public FirServiceImpl()
    {

        System.out.println("Running in the implements constructor");
    }

    @Override
    public boolean save(FIRDto dto) {
        System.out.println("save method in Fur impl Class");
        return true;
    }
}
