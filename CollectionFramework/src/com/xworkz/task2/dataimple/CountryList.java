package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.CountryDto;
import com.xworkz.task2.dto.PresidentDto;

import java.util.LinkedList;
import java.util.List;

public class CountryList {

    public CountryList() {
        System.out.println("running in the CountryList constructor");
    }

    public List<CountryDto> getCountryList() {
        System.out.println("Running in the getCountryList method");

        List<CountryDto> list = new LinkedList<>();

        PresidentList presidentList = new PresidentList();
        List<PresidentDto> presidentGet = presidentList.getPresidentList();

        CountryDto countryDto1 = new CountryDto("India", "1.4B", "New Delhi", presidentGet.get(0));
        CountryDto countryDto2 = new CountryDto("United States", "331M", "Washington D.C.", presidentGet.get(1));
        CountryDto countryDto3 = new CountryDto("United Kingdom", "67M", "London", presidentGet.get(2));
        CountryDto countryDto4 = new CountryDto("France", "65M", "Paris", presidentGet.get(3));
        CountryDto countryDto5 = new CountryDto("Japan", "125M", "Tokyo", presidentGet.get(4));
        CountryDto countryDto6 = new CountryDto("Russia", "146M", "Moscow", presidentGet.get(5));
        CountryDto countryDto7 = new CountryDto("China", "1.4B", "Beijing", presidentGet.get(6));
        CountryDto countryDto8 = new CountryDto("Germany", "83M", "Berlin", presidentGet.get(7));
        CountryDto countryDto9 = new CountryDto("Italy", "60M", "Rome", presidentGet.get(8));
        CountryDto countryDto10 = new CountryDto("Portugal", "10M", "Lisbon", presidentGet.get(9));
        CountryDto countryDto11 = new CountryDto("South Africa", "60M", "Pretoria", presidentGet.get(10));
        CountryDto countryDto12 = new CountryDto("Turkey", "85M", "Ankara", presidentGet.get(11));
        CountryDto countryDto13 = new CountryDto("Argentina", "45M", "Buenos Aires", presidentGet.get(12));
        CountryDto countryDto14 = new CountryDto("Canada", "38M", "Ottawa", presidentGet.get(13));
        CountryDto countryDto15 = new CountryDto("Spain", "47M", "Madrid", presidentGet.get(14));
        CountryDto countryDto16 = new CountryDto("Poland", "38M", "Warsaw", presidentGet.get(15));
        CountryDto countryDto17 = new CountryDto("South Korea", "52M", "Seoul", presidentGet.get(16));
        CountryDto countryDto18 = new CountryDto("Serbia", "6.7M", "Belgrade", presidentGet.get(17));
        CountryDto countryDto19 = new CountryDto("Austria", "9M", "Vienna", presidentGet.get(18));
        CountryDto countryDto20 = new CountryDto("Belgium", "11M", "Brussels", presidentGet.get(19));
        CountryDto countryDto21 = new CountryDto("Romania", "19M", "Bucharest", presidentGet.get(20));
        CountryDto countryDto22 = new CountryDto("Greece", "10M", "Athens", presidentGet.get(21));
        CountryDto countryDto23 = new CountryDto("Montenegro", "0.6M", "Podgorica", presidentGet.get(22));
        CountryDto countryDto24 = new CountryDto("Ukraine", "43M", "Kyiv", presidentGet.get(23));
        CountryDto countryDto25 = new CountryDto("El Salvador", "6.5M", "San Salvador", presidentGet.get(24));
        CountryDto countryDto26 = new CountryDto("Cuba", "11M", "Havana", presidentGet.get(25));
        CountryDto countryDto27 = new CountryDto("Chile", "19M", "Santiago", presidentGet.get(26));
        CountryDto countryDto28 = new CountryDto("Brazil", "213M", "Brasília", presidentGet.get(27));
        CountryDto countryDto29 = new CountryDto("Indonesia", "276M", "Jakarta", presidentGet.get(28));
        CountryDto countryDto30 = new CountryDto("Mongolia", "3.3M", "Ulaanbaatar", presidentGet.get(29));

        list.add(countryDto1);
        list.add(countryDto2);
        list.add(countryDto3);
        list.add(countryDto4);
        list.add(countryDto5);
        list.add(countryDto6);
        list.add(countryDto7);
        list.add(countryDto8);
        list.add(countryDto9);
        list.add(countryDto10);
        list.add(countryDto11);
        list.add(countryDto12);
        list.add(countryDto13);
        list.add(countryDto14);
        list.add(countryDto15);
        list.add(countryDto16);
        list.add(countryDto17);
        list.add(countryDto18);
        list.add(countryDto19);
        list.add(countryDto20);
        list.add(countryDto21);
        list.add(countryDto22);
        list.add(countryDto23);
        list.add(countryDto24);
        list.add(countryDto25);
        list.add(countryDto26);
        list.add(countryDto27);
        list.add(countryDto28);
        list.add(countryDto29);
        list.add(countryDto30);

        return list;
    }
}
