package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.CountryDto;
import com.xworkz.task2.dto.CustomerDto;
import com.xworkz.task2.dto.PasswordDto;

import java.util.LinkedList;
import java.util.List;

public class PasswordList {

    public PasswordList()
    {
        System.out.println("running in the PasswordList constructor");
    }

    public List<PasswordDto> getPasswordList()
    {

        System.out.println("Running in the getPasswordList method ");

        List<PasswordDto> list=new LinkedList<>();

        CountryList countrylist= new CountryList();
        List<CountryDto> countryGet = countrylist.getCountryList();



        PasswordDto passwordDto1 = new PasswordDto("numeric", true, 7, countryGet.get(0));
        PasswordDto passwordDto2 = new PasswordDto("alphanumeric", false, 8, countryGet.get(1));
        PasswordDto passwordDto3 = new PasswordDto("symbols", true, 10, countryGet.get(2));
        PasswordDto passwordDto4 = new PasswordDto("complex", true, 12, countryGet.get(3));
        PasswordDto passwordDto5 = new PasswordDto("simple", false, 6, countryGet.get(4));
        PasswordDto passwordDto6 = new PasswordDto("numeric", true, 9, countryGet.get(5));
        PasswordDto passwordDto7 = new PasswordDto("alphanumeric", true, 11, countryGet.get(6));
        PasswordDto passwordDto8 = new PasswordDto("symbols", false, 7, countryGet.get(7));
        PasswordDto passwordDto9 = new PasswordDto("complex", true, 10, countryGet.get(8));
        PasswordDto passwordDto10 = new PasswordDto("simple", true, 5, countryGet.get(9));
        PasswordDto passwordDto11 = new PasswordDto("numeric", false, 6, countryGet.get(10));
        PasswordDto passwordDto12 = new PasswordDto("alphanumeric", true, 8, countryGet.get(11));
        PasswordDto passwordDto13 = new PasswordDto("symbols", true, 9, countryGet.get(12));
        PasswordDto passwordDto14 = new PasswordDto("complex", false, 11, countryGet.get(13));
        PasswordDto passwordDto15 = new PasswordDto("simple", false, 7, countryGet.get(14));
        PasswordDto passwordDto16 = new PasswordDto("numeric", true, 10, countryGet.get(15));
        PasswordDto passwordDto17 = new PasswordDto("alphanumeric", true, 6, countryGet.get(16));
        PasswordDto passwordDto18 = new PasswordDto("symbols", false, 8, countryGet.get(17));
        PasswordDto passwordDto19 = new PasswordDto("complex", true, 12, countryGet.get(18));
        PasswordDto passwordDto20 = new PasswordDto("simple", true, 9, countryGet.get(19));
        PasswordDto passwordDto21 = new PasswordDto("numeric", false, 7, countryGet.get(20));
        PasswordDto passwordDto22 = new PasswordDto("alphanumeric", false, 10, countryGet.get(21));
        PasswordDto passwordDto23 = new PasswordDto("symbols", true, 6, countryGet.get(22));
        PasswordDto passwordDto24 = new PasswordDto("complex", true, 8, countryGet.get(23));
        PasswordDto passwordDto25 = new PasswordDto("simple", false, 5, countryGet.get(24));
        PasswordDto passwordDto26 = new PasswordDto("numeric", true, 9, countryGet.get(25));
        PasswordDto passwordDto27 = new PasswordDto("alphanumeric", true, 11, countryGet.get(26));
        PasswordDto passwordDto28 = new PasswordDto("symbols", false, 7, countryGet.get(27));
        PasswordDto passwordDto29 = new PasswordDto("complex", true, 10, countryGet.get(28));
        PasswordDto passwordDto30 = new PasswordDto("simple", true, 6, countryGet.get(29));

        list.add(passwordDto1);
        list.add(passwordDto2);
        list.add(passwordDto3);
        list.add(passwordDto4);
        list.add(passwordDto5);
        list.add(passwordDto6);
        list.add(passwordDto7);
        list.add(passwordDto8);
        list.add(passwordDto9);
        list.add(passwordDto10);
        list.add(passwordDto11);
        list.add(passwordDto12);
        list.add(passwordDto13);
        list.add(passwordDto14);
        list.add(passwordDto15);
        list.add(passwordDto16);
        list.add(passwordDto17);
        list.add(passwordDto18);
        list.add(passwordDto19);
        list.add(passwordDto20);
        list.add(passwordDto21);
        list.add(passwordDto22);
        list.add(passwordDto23);
        list.add(passwordDto24);
        list.add(passwordDto25);
        list.add(passwordDto26);
        list.add(passwordDto27);
        list.add(passwordDto28);
        list.add(passwordDto29);
        list.add(passwordDto30);

        return  list;

    }
}
