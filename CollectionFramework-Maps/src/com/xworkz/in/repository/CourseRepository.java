package com.xworkz.in.repository;

import com.xworkz.in.dto.CourseDto;
import lombok.ToString;

import java.util.Map;
public interface CourseRepository
{
    Map<CourseDto,String[]> findAll();
}
