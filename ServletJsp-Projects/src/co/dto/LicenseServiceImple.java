package co.dto;

import co.service.LicenseService;

public class LicenseServiceImple implements LicenseService {
    public LicenseServiceImple()
    {
        System.out.println("running in the constructor of LSerImple");
    }

    @Override
    public boolean save(LicenseDto dto) {
        System.out.println("save method in LicenseServiceImple class");
        return true;
    }



}
