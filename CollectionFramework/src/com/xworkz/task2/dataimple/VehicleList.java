package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.CompanyNameDto;
import com.xworkz.task2.dto.CountryDto;
import com.xworkz.task2.dto.VehicleDto;

import java.util.LinkedList;
import java.util.List;

public class VehicleList {

    public VehicleList() {
        System.out.println("running in the VehicleList constructor");
    }

    public List<VehicleDto> getVehicleList() {
        System.out.println("Running in the getVehicleList method");

        List<VehicleDto> list = new LinkedList<>();

        CompanyNameList companyNameList = new CompanyNameList();
        List<CompanyNameDto> companyNameGet = companyNameList.getCompanyNameList();

        VehicleDto vehicleDto1 = new VehicleDto(101, 2, 200000, companyNameGet.get(0));
        VehicleDto vehicleDto2 = new VehicleDto(102, 4, 550000, companyNameGet.get(1));
        VehicleDto vehicleDto3 = new VehicleDto(103, 2, 180000, companyNameGet.get(2));
        VehicleDto vehicleDto4 = new VehicleDto(104, 4, 750000, companyNameGet.get(3));
        VehicleDto vehicleDto5 = new VehicleDto(105, 2, 220000, companyNameGet.get(4));
        VehicleDto vehicleDto6 = new VehicleDto(106, 4, 500000, companyNameGet.get(5));
        VehicleDto vehicleDto7 = new VehicleDto(107, 2, 210000, companyNameGet.get(6));
        VehicleDto vehicleDto8 = new VehicleDto(108, 4, 650000, companyNameGet.get(7));
        VehicleDto vehicleDto9 = new VehicleDto(109, 2, 195000, companyNameGet.get(8));
        VehicleDto vehicleDto10 = new VehicleDto(110, 4, 700000, companyNameGet.get(9));
        VehicleDto vehicleDto11 = new VehicleDto(111, 2, 230000, companyNameGet.get(10));
        VehicleDto vehicleDto12 = new VehicleDto(112, 4, 720000, companyNameGet.get(11));
        VehicleDto vehicleDto13 = new VehicleDto(113, 2, 210000, companyNameGet.get(12));
        VehicleDto vehicleDto14 = new VehicleDto(114, 4, 780000, companyNameGet.get(13));
        VehicleDto vehicleDto15 = new VehicleDto(115, 2, 200000, companyNameGet.get(14));
        VehicleDto vehicleDto16 = new VehicleDto(116, 4, 660000, companyNameGet.get(15));
        VehicleDto vehicleDto17 = new VehicleDto(117, 2, 190000, companyNameGet.get(16));
        VehicleDto vehicleDto18 = new VehicleDto(118, 4, 740000, companyNameGet.get(17));
        VehicleDto vehicleDto19 = new VehicleDto(119, 2, 225000, companyNameGet.get(18));
        VehicleDto vehicleDto20 = new VehicleDto(120, 4, 600000, companyNameGet.get(19));
        VehicleDto vehicleDto21 = new VehicleDto(121, 2, 235000, companyNameGet.get(20));
        VehicleDto vehicleDto22 = new VehicleDto(122, 4, 710000, companyNameGet.get(21));
        VehicleDto vehicleDto23 = new VehicleDto(123, 2, 215000, companyNameGet.get(22));
        VehicleDto vehicleDto24 = new VehicleDto(124, 4, 780000, companyNameGet.get(23));
        VehicleDto vehicleDto25 = new VehicleDto(125, 2, 205000, companyNameGet.get(24));
        VehicleDto vehicleDto26 = new VehicleDto(126, 4, 730000, companyNameGet.get(25));
        VehicleDto vehicleDto27 = new VehicleDto(127, 2, 240000, companyNameGet.get(26));
        VehicleDto vehicleDto28 = new VehicleDto(128, 4, 690000, companyNameGet.get(27));
        VehicleDto vehicleDto29 = new VehicleDto(129, 2, 198000, companyNameGet.get(28));
        VehicleDto vehicleDto30 = new VehicleDto(130, 4, 760000, companyNameGet.get(29));

        list.add(vehicleDto1);
        list.add(vehicleDto2);
        list.add(vehicleDto3);
        list.add(vehicleDto4);
        list.add(vehicleDto5);
        list.add(vehicleDto6);
        list.add(vehicleDto7);
        list.add(vehicleDto8);
        list.add(vehicleDto9);
        list.add(vehicleDto10);
        list.add(vehicleDto11);
        list.add(vehicleDto12);
        list.add(vehicleDto13);
        list.add(vehicleDto14);
        list.add(vehicleDto15);
        list.add(vehicleDto16);
        list.add(vehicleDto17);
        list.add(vehicleDto18);
        list.add(vehicleDto19);
        list.add(vehicleDto20);
        list.add(vehicleDto21);
        list.add(vehicleDto22);
        list.add(vehicleDto23);
        list.add(vehicleDto24);
        list.add(vehicleDto25);
        list.add(vehicleDto26);
        list.add(vehicleDto27);
        list.add(vehicleDto28);
        list.add(vehicleDto29);
        list.add(vehicleDto30);

        return list;
    }
}
