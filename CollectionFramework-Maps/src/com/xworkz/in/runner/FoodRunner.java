package com.xworkz.in.runner;

import com.xworkz.in.dto.FoodDto;
import com.xworkz.in.repository.FoodRepository;
import com.xworkz.in.repository.FoodRepositoryImple;

import java.util.List;
import java.util.Map;

public class FoodRunner {
    public static void main(String[] args) {
        FoodRepository foodRepository=new FoodRepositoryImple();
        Map<FoodDto, List<String>> map=foodRepository.findAll();
        map.keySet().forEach(System.out::println);
        System.out.println("****************************************************");
        map.values().forEach(System.out::println);
    }
}
