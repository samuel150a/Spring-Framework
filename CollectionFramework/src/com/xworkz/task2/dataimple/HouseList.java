package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.HouseDto;
import com.xworkz.task2.dto.SecurityDto;

import java.util.LinkedList;
import java.util.List;

public class HouseList {

    public HouseList() {
        System.out.println("running in the HouseList constructor");
    }

    public List<HouseDto> getHouseList() {
        System.out.println("Running in the getHouseList method");

        List<HouseDto> list = new LinkedList<>();

        SecurityList securityList = new SecurityList();
        List<SecurityDto> securityGet = securityList.getSecurityList();

        HouseDto houseDto1 = new HouseDto(101, 12000, "Arun", securityGet.get(0));
        HouseDto houseDto2 = new HouseDto(102, 15000, "Bhaskar", securityGet.get(1));
        HouseDto houseDto3 = new HouseDto(103, 11000, "Charan", securityGet.get(2));
        HouseDto houseDto4 = new HouseDto(104, 18000, "Dinesh", securityGet.get(3));
        HouseDto houseDto5 = new HouseDto(105, 14000, "Elango", securityGet.get(4));
        HouseDto houseDto6 = new HouseDto(106, 16000, "Farooq", securityGet.get(5));
        HouseDto houseDto7 = new HouseDto(107, 12500, "Ganesh", securityGet.get(6));
        HouseDto houseDto8 = new HouseDto(108, 17000, "Hari", securityGet.get(7));
        HouseDto houseDto9 = new HouseDto(109, 13000, "Irfan", securityGet.get(8));
        HouseDto houseDto10 = new HouseDto(110, 19000, "Jeeva", securityGet.get(9));
        HouseDto houseDto11 = new HouseDto(111, 10000, "Kumar", securityGet.get(10));
        HouseDto houseDto12 = new HouseDto(112, 15500, "Logan", securityGet.get(11));
        HouseDto houseDto13 = new HouseDto(113, 13500, "Mani", securityGet.get(12));
        HouseDto houseDto14 = new HouseDto(114, 16500, "Naveen", securityGet.get(13));
        HouseDto houseDto15 = new HouseDto(115, 17500, "Omprakash", securityGet.get(14));
        HouseDto houseDto16 = new HouseDto(116, 14500, "Prakash", securityGet.get(15));
        HouseDto houseDto17 = new HouseDto(117, 16000, "Qasim", securityGet.get(16));
        HouseDto houseDto18 = new HouseDto(118, 17000, "Ramesh", securityGet.get(17));
        HouseDto houseDto19 = new HouseDto(119, 15000, "Suresh", securityGet.get(18));
        HouseDto houseDto20 = new HouseDto(120, 18000, "Thiru", securityGet.get(19));
        HouseDto houseDto21 = new HouseDto(121, 14000, "Uday", securityGet.get(20));
        HouseDto houseDto22 = new HouseDto(122, 16500, "Vasanth", securityGet.get(21));
        HouseDto houseDto23 = new HouseDto(123, 15500, "Wahid", securityGet.get(22));
        HouseDto houseDto24 = new HouseDto(124, 14500, "Xavier", securityGet.get(23));
        HouseDto houseDto25 = new HouseDto(125, 13500, "Yusuf", securityGet.get(24));
        HouseDto houseDto26 = new HouseDto(126, 12500, "Zakir", securityGet.get(25));
        HouseDto houseDto27 = new HouseDto(127, 17500, "Ajay", securityGet.get(26));
        HouseDto houseDto28 = new HouseDto(128, 18500, "Bharath", securityGet.get(27));
        HouseDto houseDto29 = new HouseDto(129, 19500, "Charan", securityGet.get(28));
        HouseDto houseDto30 = new HouseDto(130, 20000, "Dharani", securityGet.get(29));

        list.add(houseDto1);
        list.add(houseDto2);
        list.add(houseDto3);
        list.add(houseDto4);
        list.add(houseDto5);
        list.add(houseDto6);
        list.add(houseDto7);
        list.add(houseDto8);
        list.add(houseDto9);
        list.add(houseDto10);
        list.add(houseDto11);
        list.add(houseDto12);
        list.add(houseDto13);
        list.add(houseDto14);
        list.add(houseDto15);
        list.add(houseDto16);
        list.add(houseDto17);
        list.add(houseDto18);
        list.add(houseDto19);
        list.add(houseDto20);
        list.add(houseDto21);
        list.add(houseDto22);
        list.add(houseDto23);
        list.add(houseDto24);
        list.add(houseDto25);
        list.add(houseDto26);
        list.add(houseDto27);
        list.add(houseDto28);
        list.add(houseDto29);
        list.add(houseDto30);

        return list;
    }
}
