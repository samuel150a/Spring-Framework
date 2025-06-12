package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.repository.WeatherRepository;
import com.xworkz.weather.repository.WeatherRepositoryImple;

public class WeatherServiceImple implements WeatherService{
    public WeatherServiceImple()
    {
        System.out.println("Running in the WeatherServiceImple constructor ");
    }

    @Override
    public boolean save(WeatherDto dto)
    {
        System.out.println("save method in WeatherServiceImple class");


        WeatherRepository weatherRepository=new WeatherRepositoryImple();
        return weatherRepository.persist(dto);
    }
}
