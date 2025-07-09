package com.xworkz.in.repository;

import com.xworkz.in.dto.FoodDto;

import java.util.*;

public class FoodRepositoryImple implements FoodRepository{
    public FoodRepositoryImple()
    {
        System.out.println("running in constructor FoodRepositoryImple");
    }
    @Override
    public Map<FoodDto, List<String>> findAll() {
        FoodDto foodDto1 = new FoodDto(1, "Biryani");
        FoodDto foodDto2 = new FoodDto(2, "Pizza");
        FoodDto foodDto3 = new FoodDto(3, "Burger");
        FoodDto foodDto4 = new FoodDto(4, "Pasta");
        FoodDto foodDto5 = new FoodDto(5, "Dosa");
        FoodDto foodDto6 = new FoodDto(6, "Idli");
        FoodDto foodDto7 = new FoodDto(7, "Vada Pav");
        FoodDto foodDto8 = new FoodDto(8, "Samosa");
        FoodDto foodDto9 = new FoodDto(9, "Fried Rice");
        FoodDto foodDto10 = new FoodDto(10, "Manchurian");
        FoodDto foodDto11 = new FoodDto(11, "Poha");
        FoodDto foodDto12 = new FoodDto(12, "Upma");
        FoodDto foodDto13 = new FoodDto(13, "Chapati");
        FoodDto foodDto14 = new FoodDto(14, "Paneer Butter Masala");
        FoodDto foodDto15 = new FoodDto(15, "Chicken Curry");
        FoodDto foodDto16 = new FoodDto(16, "Fish Fry");
        FoodDto foodDto17 = new FoodDto(17, "Kebabs");
        FoodDto foodDto18 = new FoodDto(18, "Chole Bhature");
        FoodDto foodDto19 = new FoodDto(19, "Rajma Chawal");
        FoodDto foodDto20 = new FoodDto(20, "Pulav");
        FoodDto foodDto21 = new FoodDto(21, "Noodles");
        FoodDto foodDto22 = new FoodDto(22, "Momos");
        FoodDto foodDto23 = new FoodDto(23, "Pav Bhaji");
        FoodDto foodDto24 = new FoodDto(24, "Thali");
        FoodDto foodDto25 = new FoodDto(25, "Butter Naan");
        Map<FoodDto,List<String>> map=new HashMap<>();

        map.put(foodDto1, Arrays.asList("samuel"));
        map.put(foodDto2, Arrays.asList("david"));
        map.put(foodDto3, Arrays.asList("ramesh"));
        map.put(foodDto4, Arrays.asList("kiran"));
        map.put(foodDto5, Arrays.asList("suresh"));
        map.put(foodDto6, Arrays.asList("vijay"));
        map.put(foodDto7, Arrays.asList("ajay"));
        map.put(foodDto8, Arrays.asList("rahul"));
        map.put(foodDto9, Arrays.asList("rohit"));
        map.put(foodDto10, Arrays.asList("manoj"));
        map.put(foodDto11, Arrays.asList("karthik"));
        map.put(foodDto12, Arrays.asList("santosh"));
        map.put(foodDto13, Arrays.asList("naveen"));
        map.put(foodDto14, Arrays.asList("praveen"));
        map.put(foodDto15, Arrays.asList("ravi"));
        map.put(foodDto16, Arrays.asList("harsha"));
        map.put(foodDto17, Arrays.asList("lokesh"));
        map.put(foodDto18, Arrays.asList("yogesh"));
        map.put(foodDto19, Arrays.asList("pavan"));
        map.put(foodDto20, Arrays.asList("tarun"));
        map.put(foodDto21, Arrays.asList("ganesh"));
        map.put(foodDto22, Arrays.asList("dinesh"));
        map.put(foodDto23, Arrays.asList("siddharth"));
        map.put(foodDto24, Arrays.asList("vikas"));
        map.put(foodDto25, Arrays.asList("tejas"));

        return map;

    }
}
