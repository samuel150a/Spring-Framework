package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.DriverDto;
import com.xworkz.task2.dto.PresidentDto;

import java.util.LinkedList;
import java.util.List;

public class PresidentList {

    public PresidentList() {
        System.out.println("running in the PresidentList constructor");
    }

    public List<PresidentDto> getPresidentList() {
        System.out.println("Running in the getPresidentList method");

        List<PresidentDto> list = new LinkedList<>();

        DriverList driverList = new DriverList();
        List<DriverDto> driverGet = driverList.getDriverList();

        PresidentDto presidentDto1 = new PresidentDto("Ram Nath Kovind", 76, "LLB", driverGet.get(0));
        PresidentDto presidentDto2 = new PresidentDto("Joe Biden", 81, "JD", driverGet.get(1));
        PresidentDto presidentDto3 = new PresidentDto("Rishi Sunak", 44, "MBA", driverGet.get(2));
        PresidentDto presidentDto4 = new PresidentDto("Emmanuel Macron", 47, "PhD", driverGet.get(3));
        PresidentDto presidentDto5 = new PresidentDto("Fumio Kishida", 66, "Law", driverGet.get(4));
        PresidentDto presidentDto6 = new PresidentDto("Vladimir Putin", 71, "Economics", driverGet.get(5));
        PresidentDto presidentDto7 = new PresidentDto("Xi Jinping", 70, "Chemical Engineering", driverGet.get(6));
        PresidentDto presidentDto8 = new PresidentDto("Frank-Walter Steinmeier", 68, "Law", driverGet.get(7));
        PresidentDto presidentDto9 = new PresidentDto("Sergio Mattarella", 82, "Law", driverGet.get(8));
        PresidentDto presidentDto10 = new PresidentDto("Marcelo Rebelo", 75, "Political Science", driverGet.get(9));
        PresidentDto presidentDto11 = new PresidentDto("Cyril Ramaphosa", 71, "Law", driverGet.get(10));
        PresidentDto presidentDto12 = new PresidentDto("Recep Tayyip Erdoğan", 70, "Business Admin", driverGet.get(11));
        PresidentDto presidentDto13 = new PresidentDto("Alberto Fernández", 65, "Law", driverGet.get(12));
        PresidentDto presidentDto14 = new PresidentDto("Justin Trudeau", 52, "Education", driverGet.get(13));
        PresidentDto presidentDto15 = new PresidentDto("Pedro Sánchez", 52, "Economics", driverGet.get(14));
        PresidentDto presidentDto16 = new PresidentDto("Andrzej Duda", 52, "Law", driverGet.get(15));
        PresidentDto presidentDto17 = new PresidentDto("Moon Jae-in", 71, "Law", driverGet.get(16));
        PresidentDto presidentDto18 = new PresidentDto("Aleksandar Vučić", 54, "Law", driverGet.get(17));
        PresidentDto presidentDto19 = new PresidentDto("Alexander Van der Bellen", 80, "Economics", driverGet.get(18));
        PresidentDto presidentDto20 = new PresidentDto("Charles Michel", 49, "Political Science", driverGet.get(19));
        PresidentDto presidentDto21 = new PresidentDto("Klaus Iohannis", 65, "Physics", driverGet.get(20));
        PresidentDto presidentDto22 = new PresidentDto("Katerina Sakellaropoulou", 68, "Law", driverGet.get(21));
        PresidentDto presidentDto23 = new PresidentDto("Milo Đukanović", 62, "Economics", driverGet.get(22));
        PresidentDto presidentDto24 = new PresidentDto("Volodymyr Zelenskyy", 46, "Law", driverGet.get(23));
        PresidentDto presidentDto25 = new PresidentDto("Nayib Bukele", 43, "Marketing", driverGet.get(24));
        PresidentDto presidentDto26 = new PresidentDto("Miguel Díaz-Canel", 64, "Electrical Engineering", driverGet.get(25));
        PresidentDto presidentDto27 = new PresidentDto("Gabriel Boric", 38, "Law", driverGet.get(26));
        PresidentDto presidentDto28 = new PresidentDto("Luiz Inácio Lula", 78, "None", driverGet.get(27));
        PresidentDto presidentDto29 = new PresidentDto("Joko Widodo", 63, "Forestry", driverGet.get(28));
        PresidentDto presidentDto30 = new PresidentDto("Ukhnaa Khurelsukh", 56, "Public Administration", driverGet.get(29));

        list.add(presidentDto1);
        list.add(presidentDto2);
        list.add(presidentDto3);
        list.add(presidentDto4);
        list.add(presidentDto5);
        list.add(presidentDto6);
        list.add(presidentDto7);
        list.add(presidentDto8);
        list.add(presidentDto9);
        list.add(presidentDto10);
        list.add(presidentDto11);
        list.add(presidentDto12);
        list.add(presidentDto13);
        list.add(presidentDto14);
        list.add(presidentDto15);
        list.add(presidentDto16);
        list.add(presidentDto17);
        list.add(presidentDto18);
        list.add(presidentDto19);
        list.add(presidentDto20);
        list.add(presidentDto21);
        list.add(presidentDto22);
        list.add(presidentDto23);
        list.add(presidentDto24);
        list.add(presidentDto25);
        list.add(presidentDto26);
        list.add(presidentDto27);
        list.add(presidentDto28);
        list.add(presidentDto29);
        list.add(presidentDto30);

        return list;
    }
}
