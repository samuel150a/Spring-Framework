package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.EducationDto;

import java.util.LinkedList;
import java.util.List;

public class EducationList {

    public EducationList() {
        System.out.println("Running in the EducationList constructor");
    }

    public List<EducationDto> getEducationList() {
        System.out.println("Running in the getEducationList method");

        List<EducationDto> list = new LinkedList<>();

        EducationDto educationDto1 = new EducationDto(8, 2019, 45000, "IIT Madras");
        EducationDto educationDto2 = new EducationDto(7, 2018, 40000, "Anna University");
        EducationDto educationDto3 = new EducationDto(9, 2020, 50000, "IIT Bombay");
        EducationDto educationDto4 = new EducationDto(6, 2017, 30000, "Osmania University");
        EducationDto educationDto5 = new EducationDto(8, 2016, 42000, "NIT Trichy");
        EducationDto educationDto6 = new EducationDto(7, 2015, 38000, "JNTU Hyderabad");
        EducationDto educationDto7 = new EducationDto(9, 2021, 53000, "BITS Pilani");
        EducationDto educationDto8 = new EducationDto(8, 2022, 46000, "PSG College");
        EducationDto educationDto9 = new EducationDto(6, 2014, 31000, "Christ University");
        EducationDto educationDto10 = new EducationDto(7, 2013, 35000, "SRM University");
        EducationDto educationDto11 = new EducationDto(8, 2020, 41000, "Amrita University");
        EducationDto educationDto12 = new EducationDto(9, 2019, 56000, "VIT Vellore");
        EducationDto educationDto13 = new EducationDto(6, 2012, 30000, "Loyola College");
        EducationDto educationDto14 = new EducationDto(7, 2016, 37000, "St. Joseph's College");
        EducationDto educationDto15 = new EducationDto(8, 2015, 43000, "Rajalakshmi Engineering");
        EducationDto educationDto16 = new EducationDto(7, 2014, 36000, "Sastra University");
        EducationDto educationDto17 = new EducationDto(9, 2021, 59000, "Delhi University");
        EducationDto educationDto18 = new EducationDto(6, 2013, 32000, "Bangalore University");
        EducationDto educationDto19 = new EducationDto(8, 2011, 47000, "Mumbai University");
        EducationDto educationDto20 = new EducationDto(7, 2010, 34000, "Pune University");
        EducationDto educationDto21 = new EducationDto(9, 2022, 61000, "IIT Delhi");
        EducationDto educationDto22 = new EducationDto(8, 2023, 44000, "MIT Chennai");
        EducationDto educationDto23 = new EducationDto(7, 2021, 39000, "SRM Easwari");
        EducationDto educationDto24 = new EducationDto(6, 2020, 31000, "Hindustan University");
        EducationDto educationDto25 = new EducationDto(8, 2018, 45000, "Vel Tech");
        EducationDto educationDto26 = new EducationDto(7, 2017, 37000, "Kongu Engineering");
        EducationDto educationDto27 = new EducationDto(9, 2019, 55000, "NIT Calicut");
        EducationDto educationDto28 = new EducationDto(6, 2016, 30000, "IIIT Hyderabad");
        EducationDto educationDto29 = new EducationDto(7, 2015, 35000, "Jain University");
        EducationDto educationDto30 = new EducationDto(8, 2014, 42000, "MS Ramaiah");

        list.add(educationDto1);
        list.add(educationDto2);
        list.add(educationDto3);
        list.add(educationDto4);
        list.add(educationDto5);
        list.add(educationDto6);
        list.add(educationDto7);
        list.add(educationDto8);
        list.add(educationDto9);
        list.add(educationDto10);
        list.add(educationDto11);
        list.add(educationDto12);
        list.add(educationDto13);
        list.add(educationDto14);
        list.add(educationDto15);
        list.add(educationDto16);
        list.add(educationDto17);
        list.add(educationDto18);
        list.add(educationDto19);
        list.add(educationDto20);
        list.add(educationDto21);
        list.add(educationDto22);
        list.add(educationDto23);
        list.add(educationDto24);
        list.add(educationDto25);
        list.add(educationDto26);
        list.add(educationDto27);
        list.add(educationDto28);
        list.add(educationDto29);
        list.add(educationDto30);

        return list;
    }
}
