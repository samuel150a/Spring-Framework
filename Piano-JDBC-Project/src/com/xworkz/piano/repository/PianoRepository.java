package com.xworkz.piano.repository;

import com.xworkz.piano.dto.PianoDto;

import java.util.Optional;

public interface PianoRepository {

        boolean persist(PianoDto dto);
         default  Optional<PianoDto> findById(int PianoId)
         {
             return Optional.empty();
         }




}
