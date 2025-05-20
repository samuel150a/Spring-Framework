package co.dto;

import co.service.DonationService;

public class DonationImple  implements DonationService
{
    public DonationImple()
    {
        System.out.println("Running in the implements constructor");
    }


    @Override
    public boolean save(DonationDto dto) {
        System.out.println("Save method in the DontionImple class");
        return true;
    }
}
