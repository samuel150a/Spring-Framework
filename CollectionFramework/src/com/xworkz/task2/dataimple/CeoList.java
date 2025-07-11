package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.CeoDto;
import com.xworkz.task2.dto.HouseDto;

import java.util.LinkedList;
import java.util.List;

public class CeoList {

    public CeoList() {
        System.out.println("running in the CeoList constructor");
    }

    public List<CeoDto> getCeoList() {
        System.out.println("Running in the getCeoList method");

        List<CeoDto> list = new LinkedList<>();

        HouseList houseList = new HouseList();
        List<HouseDto> houseGet = houseList.getHouseList();

        CeoDto ceoDto1 = new CeoDto("Sundar Pichai", 50, 25, houseGet.get(0));
        CeoDto ceoDto2 = new CeoDto("Satya Nadella", 55, 28, houseGet.get(1));
        CeoDto ceoDto3 = new CeoDto("Arvind Krishna", 52, 27, houseGet.get(2));
        CeoDto ceoDto4 = new CeoDto("Andy Jassy", 54, 30, houseGet.get(3));
        CeoDto ceoDto5 = new CeoDto("Tim Cook", 63, 35, houseGet.get(4));
        CeoDto ceoDto6 = new CeoDto("Mark Zuckerberg", 40, 20, houseGet.get(5));
        CeoDto ceoDto7 = new CeoDto("Elon Musk", 52, 32, houseGet.get(6));
        CeoDto ceoDto8 = new CeoDto("Rajesh Gopinathan", 49, 24, houseGet.get(7));
        CeoDto ceoDto9 = new CeoDto("Salil Parekh", 56, 29, houseGet.get(8));
        CeoDto ceoDto10 = new CeoDto("Thierry Delaporte", 55, 31, houseGet.get(9));
        CeoDto ceoDto11 = new CeoDto("Julie Sweet", 56, 30, houseGet.get(10));
        CeoDto ceoDto12 = new CeoDto("Shantanu Narayen", 60, 34, houseGet.get(11));
        CeoDto ceoDto13 = new CeoDto("Marc Benioff", 59, 36, houseGet.get(12));
        CeoDto ceoDto14 = new CeoDto("Daniel Zhang", 51, 26, houseGet.get(13));
        CeoDto ceoDto15 = new CeoDto("Gopal Vittal", 53, 27, houseGet.get(14));
        CeoDto ceoDto16 = new CeoDto("Kunal Bahl", 42, 21, houseGet.get(15));
        CeoDto ceoDto17 = new CeoDto("Binny Bansal", 41, 22, houseGet.get(16));
        CeoDto ceoDto18 = new CeoDto("Bhavish Aggarwal", 39, 20, houseGet.get(17));
        CeoDto ceoDto19 = new CeoDto("Deepinder Goyal", 40, 19, houseGet.get(18));
        CeoDto ceoDto20 = new CeoDto("Narayana Murthy", 76, 40, houseGet.get(19));
        CeoDto ceoDto21 = new CeoDto("Vineet Nayar", 60, 38, houseGet.get(20));
        CeoDto ceoDto22 = new CeoDto("Peter Thiel", 56, 34, houseGet.get(21));
        CeoDto ceoDto23 = new CeoDto("Susan Wojcicki", 51, 30, houseGet.get(22));
        CeoDto ceoDto24 = new CeoDto("Jeff Weiner", 54, 29, houseGet.get(23));
        CeoDto ceoDto25 = new CeoDto("Brian Chesky", 43, 20, houseGet.get(24));
        CeoDto ceoDto26 = new CeoDto("Dara Khosrowshahi", 53, 32, houseGet.get(25));
        CeoDto ceoDto27 = new CeoDto("Larry Page", 50, 33, houseGet.get(26));
        CeoDto ceoDto28 = new CeoDto("Sergey Brin", 49, 32, houseGet.get(27));
        CeoDto ceoDto29 = new CeoDto("Jack Dorsey", 47, 25, houseGet.get(28));
        CeoDto ceoDto30 = new CeoDto("Evan Spiegel", 34, 15, houseGet.get(29));

        list.add(ceoDto1);
        list.add(ceoDto2);
        list.add(ceoDto3);
        list.add(ceoDto4);
        list.add(ceoDto5);
        list.add(ceoDto6);
        list.add(ceoDto7);
        list.add(ceoDto8);
        list.add(ceoDto9);
        list.add(ceoDto10);
        list.add(ceoDto11);
        list.add(ceoDto12);
        list.add(ceoDto13);
        list.add(ceoDto14);
        list.add(ceoDto15);
        list.add(ceoDto16);
        list.add(ceoDto17);
        list.add(ceoDto18);
        list.add(ceoDto19);
        list.add(ceoDto20);
        list.add(ceoDto21);
        list.add(ceoDto22);
        list.add(ceoDto23);
        list.add(ceoDto24);
        list.add(ceoDto25);
        list.add(ceoDto26);
        list.add(ceoDto27);
        list.add(ceoDto28);
        list.add(ceoDto29);
        list.add(ceoDto30);

        return list;
    }
}
