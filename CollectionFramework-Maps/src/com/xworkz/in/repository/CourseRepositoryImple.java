package com.xworkz.in.repository;

import com.xworkz.in.dto.CourseDto;
import lombok.ToString;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@ToString
public class CourseRepositoryImple implements CourseRepository{
    public CourseRepositoryImple()
    {
        System.out.println("Running in CourseRepositoryImple constructor");
    }
    @Override
    public Map<CourseDto, String[]> findAll() {
        CourseDto courseDto1 = new CourseDto(300, "Electronics & Communication Engineering");
        CourseDto courseDto2 = new CourseDto(301, "Computer Science Engineering");
        CourseDto courseDto3 = new CourseDto(302, "Mechanical Engineering");
        CourseDto courseDto4 = new CourseDto(303, "Civil Engineering");
        CourseDto courseDto5 = new CourseDto(304, "Electrical Engineering");
        CourseDto courseDto6 = new CourseDto(305, "Information Science Engineering");
        CourseDto courseDto7 = new CourseDto(306, "Automobile Engineering");
        CourseDto courseDto8 = new CourseDto(307, "Aerospace Engineering");
        CourseDto courseDto9 = new CourseDto(308, "Biotechnology Engineering");
        CourseDto courseDto10 = new CourseDto(309, "Mechatronics Engineering");
        CourseDto courseDto11 = new CourseDto(310, "Robotics Engineering");
        CourseDto courseDto12 = new CourseDto(311, "Petroleum Engineering");
        CourseDto courseDto13 = new CourseDto(312, "Chemical Engineering");
        CourseDto courseDto14 = new CourseDto(313, "Environmental Engineering");
        CourseDto courseDto15 = new CourseDto(314, "Marine Engineering");
        CourseDto courseDto16 = new CourseDto(315, "Industrial Engineering");
        CourseDto courseDto17 = new CourseDto(316, "Instrumentation Engineering");
        CourseDto courseDto18 = new CourseDto(317, "Mining Engineering");
        CourseDto courseDto19 = new CourseDto(318, "Textile Engineering");
        CourseDto courseDto20 = new CourseDto(319, "Agricultural Engineering");
        CourseDto courseDto21 = new CourseDto(320, "Food Technology");
        CourseDto courseDto22 = new CourseDto(321, "Software Engineering");
        CourseDto courseDto23 = new CourseDto(322, "Biomedical Engineering");
        CourseDto courseDto24 = new CourseDto(323, "Construction Technology & Management");
        CourseDto courseDto25 = new CourseDto(324, "Metallurgical Engineering");

        Map<CourseDto,String[]> map=new HashMap<>();
        map.put(courseDto1, new String[]{"suresh", "ramesh", "sathish"});
        map.put(courseDto2, new String[]{"kiran", "deepak", "arun"});
        map.put(courseDto3, new String[]{"varun", "rahul", "naveen"});
        map.put(courseDto4, new String[]{"dinesh", "ganesh", "harish"});
        map.put(courseDto5, new String[]{"praveen", "lokesh", "santosh"});
        map.put(courseDto6, new String[]{"ravi", "manoj", "vijay"});
        map.put(courseDto7, new String[]{"tarun", "mahesh", "kishore"});
        map.put(courseDto8, new String[]{"yogesh", "sagar", "karthik"});
        map.put(courseDto9, new String[]{"bhaskar", "mohan", "anil"});
        map.put(courseDto10, new String[]{"nithin", "sharan", "rohit"});
        map.put(courseDto11, new String[]{"pavan", "sachin", "abhishek"});
        map.put(courseDto12, new String[]{"rajat", "sunil", "vivek"});
        map.put(courseDto13, new String[]{"tejas", "nandan", "deepu"});
        map.put(courseDto14, new String[]{"shiva", "surya", "roshan"});
        map.put(courseDto15, new String[]{"anand", "dev", "ajay"});
        map.put(courseDto16, new String[]{"bharath", "vishal", "sudeep"});
        map.put(courseDto17, new String[]{"kumar", "laxman", "arvind"});
        map.put(courseDto18, new String[]{"sanket", "parth", "neeraj"});
        map.put(courseDto19, new String[]{"vimal", "darshan", "shreyas"});
        map.put(courseDto20, new String[]{"akash", "kartik", "jayanth"});
        map.put(courseDto21, new String[]{"mukesh", "rahim", "salman"});
        map.put(courseDto22, new String[]{"omkar", "harsha", "manish"});
        map.put(courseDto23, new String[]{"girish", "venkat", "madan"});
        map.put(courseDto24, new String[]{"sumanth", "nithesh", "rajesh"});
        map.put(courseDto25, new String[]{"uday", "siddharth", "dilip"});
        return map;
    }
}
