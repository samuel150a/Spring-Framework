package com.xworkz.in.runner;

import com.xworkz.in.dto.CourseDto;
import com.xworkz.in.repository.CourseRepository;
import com.xworkz.in.repository.CourseRepositoryImple;


import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class CourseRunner {

    public static void main(String[] args) {
        CourseRepository courseRepository=new CourseRepositoryImple();
        Map<CourseDto,String[]> map =courseRepository.findAll();

       /* map.keySet().forEach(System.out::println);
        System.out.println("****************************************************");
        map.values().forEach(e->System.out.println(Arrays.toString(e)));*/

        Set<Map.Entry<CourseDto,String[]>> entryset=map.entrySet();
        entryset.forEach(e->{
            System.out.println(e.getKey());
            System.out.println(Arrays.toString(e.getValue()));});


    }
}
