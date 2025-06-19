package com.xworkz.olympic.service;

import com.xworkz.olympic.dto.OlympicDto;

import java.sql.SQLException;
import java.util.Optional;

public interface OlympicService
{
    boolean save(OlympicDto dto);
    default Optional<OlympicDto>findById(int OlympicId) throws SQLException, ClassNotFoundException
    {
        return Optional.empty();
    }
}
