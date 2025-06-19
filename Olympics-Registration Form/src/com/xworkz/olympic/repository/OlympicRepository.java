package com.xworkz.olympic.repository;

import com.xworkz.olympic.dto.OlympicDto;

import java.sql.SQLException;
import java.util.Optional;

public interface OlympicRepository

{
    boolean persist(OlympicDto dto);
    default Optional<OlympicDto>findById(int OlympicId) throws ClassNotFoundException, SQLException


    {
        return Optional.empty();
    }
}
