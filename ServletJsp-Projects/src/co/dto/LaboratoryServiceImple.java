package co.dto;

import co.service.LaboratoryService;

public class LaboratoryServiceImple implements LaboratoryService {

    public LaboratoryServiceImple(){
        System.out.println("running in the Constructor LaboratoryServiceImple ");
    }


    @Override
    public boolean save(LaboratoryDto dto) {

        System.out.println("running in save method of  the Class LaboratoryServiceImple ");
        return true;
    }
}
