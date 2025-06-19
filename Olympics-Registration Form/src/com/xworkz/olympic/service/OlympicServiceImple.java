package com.xworkz.olympic.service;

import com.xworkz.olympic.dto.OlympicDto;
import com.xworkz.olympic.repository.OlympicRepository;
import com.xworkz.olympic.repository.OlympicRepositoryImple;

import java.sql.SQLException;
import java.util.Optional;

public class OlympicServiceImple implements OlympicService {

    public OlympicServiceImple() {

        System.out.println("Running in the OlympicServiceImple constructor");
    }

    public boolean save(OlympicDto dto) {
        boolean saved = true;
        if (dto == null) {
            System.out.println("DTO returning null");
            saved = false;
        }


        if (dto.getMemberName() == null) {
            System.out.println("Invalid MemberName ");
            saved = false;
        }
        if (dto.getDob() == null ) {
            System.out.println("Invalid Dob");
            saved = false;
        }
        if (dto.getGender()==null) {
            System.out.println("Invalid Gender");
            saved = false;
        }

        if (dto.getPhone()==null) {
            System.out.println("Invalid Phone no");
            saved = false;
        }

        if (dto.getState()==null) {
            System.out.println("Invalid State");
            saved = false;
        }

        if (dto.getCity()==null) {
            System.out.println("Invalid City");
            saved = false;
        }

        if (dto.getSport()==null) {
            System.out.println("Invalid  Sport");
            saved = false;
        }
        System.out.println("data is valid, will save into DB using repo..");

        OlympicRepository olympicRepository=new OlympicRepositoryImple();
         boolean repo=olympicRepository.persist(dto);
         return saved;

    }

    @Override
    public Optional<OlympicDto> findById(int OlympicId) throws SQLException, ClassNotFoundException {
        System.out.println("running findById in OlympicServiceImple");
        if(OlympicId>0)
        {
            System.out.println("id is valid :"+OlympicId);// call the repo
            OlympicRepository olympicRepository=new OlympicRepositoryImple();
            return olympicRepository.findById(OlympicId);
        }
        return OlympicService.super.findById(OlympicId);
    }
}


