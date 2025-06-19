package com.xworkz.piano.service;

import com.xworkz.piano.dto.PianoDto;
import com.xworkz.piano.repository.PianoRepository;
import com.xworkz.piano.repository.PianoRepositoryImple;
import lombok.SneakyThrows;

import java.util.Optional;

public class PianoServiceImple implements PianoService {
    public PianoServiceImple() {
        System.out.println("Running in the PianoServiceImple");
    }

    @Override
    public boolean save(PianoDto dto){

        boolean saved = true;
        if(dto==null){
            System.out.println("DTO returning null");
            saved = false;
        }

        if (dto.getCustomberName() == null ) {
            System.out.println("Invalid Customber name");
            saved = false;
        }


        if (dto.getModelName() == null ) {
            System.out.println("Invalid ModelName");
            saved = false;
        }


        if (dto.getPrice()==null) {
            System.out.println("Invalid price");
            saved = false;
        }

        if (dto.getNoOfKeys()==null) {
            System.out.println("Invalid keys");
            saved = false;
        }


        if (dto.getMemberShip()==null ) {
            System.out.println("invalid membership input");
            saved = false;
        }


        if (dto.getManufactured() == null ) {
            System.out.println("Invalid manu ");
            saved = false;
        }




        System.out.println("data is valid, will save into DB using repo..");
        PianoRepository pianoRepository = new PianoRepositoryImple();

        boolean repo= pianoRepository.persist(dto);
        return saved;
    }
    @SneakyThrows
    @Override
    public Optional<PianoDto> findById( int PianoId)
    {
        System.out.println("running findById in PianoServiceImple");
        if(PianoId>0)
        {
            System.out.println("id is valid :"+PianoId);// call the repo
            PianoRepository pianoRepository=new PianoRepositoryImple();
            return pianoRepository.findById(PianoId);
        }
        return PianoService.super.findById(PianoId);
    }
}

