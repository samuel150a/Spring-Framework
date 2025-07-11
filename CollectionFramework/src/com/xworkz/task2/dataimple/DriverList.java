package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.DriverDto;
import com.xworkz.task2.dto.VehicleDto;

import java.util.LinkedList;
import java.util.List;

public class DriverList {

    public DriverList() {
        System.out.println("running in the DriverList constructor");
    }

    public List<DriverDto> getDriverList() {
        System.out.println("Running in the getDriverList method");

        List<DriverDto> list = new LinkedList<>();

        VehicleList vehicleList = new VehicleList();
        List<VehicleDto> vehicleGet = vehicleList.getVehicleList();

        DriverDto driverDto1 = new DriverDto("Arun", "30", 25000, vehicleGet.get(0));
        DriverDto driverDto2 = new DriverDto("Bhaskar", "35", 27000, vehicleGet.get(1));
        DriverDto driverDto3 = new DriverDto("Chandru", "28", 22000, vehicleGet.get(2));
        DriverDto driverDto4 = new DriverDto("Dinesh", "32", 30000, vehicleGet.get(3));
        DriverDto driverDto5 = new DriverDto("Elango", "40", 26000, vehicleGet.get(4));
        DriverDto driverDto6 = new DriverDto("Farooq", "29", 24500, vehicleGet.get(5));
        DriverDto driverDto7 = new DriverDto("Ganesh", "31", 31000, vehicleGet.get(6));
        DriverDto driverDto8 = new DriverDto("Hari", "33", 29500, vehicleGet.get(7));
        DriverDto driverDto9 = new DriverDto("Irfan", "27", 23500, vehicleGet.get(8));
        DriverDto driverDto10 = new DriverDto("Jeeva", "36", 32000, vehicleGet.get(9));
        DriverDto driverDto11 = new DriverDto("Kumar", "38", 28500, vehicleGet.get(10));
        DriverDto driverDto12 = new DriverDto("Logan", "34", 27500, vehicleGet.get(11));
        DriverDto driverDto13 = new DriverDto("Mani", "29", 26500, vehicleGet.get(12));
        DriverDto driverDto14 = new DriverDto("Naveen", "30", 24000, vehicleGet.get(13));
        DriverDto driverDto15 = new DriverDto("Omprakash", "45", 33000, vehicleGet.get(14));
        DriverDto driverDto16 = new DriverDto("Prakash", "28", 25500, vehicleGet.get(15));
        DriverDto driverDto17 = new DriverDto("Qasim", "31", 29000, vehicleGet.get(16));
        DriverDto driverDto18 = new DriverDto("Ramesh", "32", 30000, vehicleGet.get(17));
        DriverDto driverDto19 = new DriverDto("Suresh", "37", 31000, vehicleGet.get(18));
        DriverDto driverDto20 = new DriverDto("Thiru", "39", 30500, vehicleGet.get(19));
        DriverDto driverDto21 = new DriverDto("Uday", "33", 27000, vehicleGet.get(20));
        DriverDto driverDto22 = new DriverDto("Vasanth", "35", 29000, vehicleGet.get(21));
        DriverDto driverDto23 = new DriverDto("Wahid", "29", 26000, vehicleGet.get(22));
        DriverDto driverDto24 = new DriverDto("Xavier", "30", 28500, vehicleGet.get(23));
        DriverDto driverDto25 = new DriverDto("Yusuf", "41", 29500, vehicleGet.get(24));
        DriverDto driverDto26 = new DriverDto("Zakir", "27", 25000, vehicleGet.get(25));
        DriverDto driverDto27 = new DriverDto("Ajay", "34", 27000, vehicleGet.get(26));
        DriverDto driverDto28 = new DriverDto("Bharath", "36", 29000, vehicleGet.get(27));
        DriverDto driverDto29 = new DriverDto("Charan", "33", 30000, vehicleGet.get(28));
        DriverDto driverDto30 = new DriverDto("Dharani", "30", 26000, vehicleGet.get(29));

        list.add(driverDto1);
        list.add(driverDto2);
        list.add(driverDto3);
        list.add(driverDto4);
        list.add(driverDto5);
        list.add(driverDto6);
        list.add(driverDto7);
        list.add(driverDto8);
        list.add(driverDto9);
        list.add(driverDto10);
        list.add(driverDto11);
        list.add(driverDto12);
        list.add(driverDto13);
        list.add(driverDto14);
        list.add(driverDto15);
        list.add(driverDto16);
        list.add(driverDto17);
        list.add(driverDto18);
        list.add(driverDto19);
        list.add(driverDto20);
        list.add(driverDto21);
        list.add(driverDto22);
        list.add(driverDto23);
        list.add(driverDto24);
        list.add(driverDto25);
        list.add(driverDto26);
        list.add(driverDto27);
        list.add(driverDto28);
        list.add(driverDto29);
        list.add(driverDto30);

        return list;
    }
}
