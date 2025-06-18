package com.xworkz.piano.service;

import com.xworkz.piano.dto.PianoDto;

import java.util.Optional;

public interface PianoService
{
    boolean save(PianoDto dto);

    default Optional<PianoDto>findById(int PianoId)
    {
        return Optional.empty();
    }
}
