package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.JobDto;
import com.xworkz.task2.dto.SecurityDto;

import java.util.LinkedList;
import java.util.List;

public class SecurityList {

    public SecurityList() {
        System.out.println("running in the SecurityList constructor");
    }

    public List<SecurityDto> getSecurityList() {
        System.out.println("Running in the getSecurityList method");

        List<SecurityDto> list = new LinkedList<>();

        JobList jobList = new JobList();
        List<JobDto> jobGet = jobList.getJobList();

        SecurityDto securityDto1 = new SecurityDto(45, 15, jobGet.get(0));
        SecurityDto securityDto2 = new SecurityDto(38, 10, jobGet.get(1));
        SecurityDto securityDto3 = new SecurityDto(50, 20, jobGet.get(2));
        SecurityDto securityDto4 = new SecurityDto(42, 12, jobGet.get(3));
        SecurityDto securityDto5 = new SecurityDto(36, 9, jobGet.get(4));
        SecurityDto securityDto6 = new SecurityDto(40, 11, jobGet.get(5));
        SecurityDto securityDto7 = new SecurityDto(48, 18, jobGet.get(6));
        SecurityDto securityDto8 = new SecurityDto(44, 14, jobGet.get(7));
        SecurityDto securityDto9 = new SecurityDto(41, 13, jobGet.get(8));
        SecurityDto securityDto10 = new SecurityDto(39, 10, jobGet.get(9));
        SecurityDto securityDto11 = new SecurityDto(37, 8, jobGet.get(10));
        SecurityDto securityDto12 = new SecurityDto(46, 16, jobGet.get(11));
        SecurityDto securityDto13 = new SecurityDto(49, 19, jobGet.get(12));
        SecurityDto securityDto14 = new SecurityDto(43, 13, jobGet.get(13));
        SecurityDto securityDto15 = new SecurityDto(35, 7, jobGet.get(14));
        SecurityDto securityDto16 = new SecurityDto(51, 21, jobGet.get(15));
        SecurityDto securityDto17 = new SecurityDto(34, 6, jobGet.get(16));
        SecurityDto securityDto18 = new SecurityDto(47, 17, jobGet.get(17));
        SecurityDto securityDto19 = new SecurityDto(52, 22, jobGet.get(18));
        SecurityDto securityDto20 = new SecurityDto(33, 5, jobGet.get(19));
        SecurityDto securityDto21 = new SecurityDto(36, 8, jobGet.get(20));
        SecurityDto securityDto22 = new SecurityDto(42, 12, jobGet.get(21));
        SecurityDto securityDto23 = new SecurityDto(38, 10, jobGet.get(22));
        SecurityDto securityDto24 = new SecurityDto(45, 15, jobGet.get(23));
        SecurityDto securityDto25 = new SecurityDto(40, 11, jobGet.get(24));
        SecurityDto securityDto26 = new SecurityDto(50, 20, jobGet.get(25));
        SecurityDto securityDto27 = new SecurityDto(39, 9, jobGet.get(26));
        SecurityDto securityDto28 = new SecurityDto(44, 13, jobGet.get(27));
        SecurityDto securityDto29 = new SecurityDto(41, 12, jobGet.get(28));
        SecurityDto securityDto30 = new SecurityDto(37, 8, jobGet.get(29));

        list.add(securityDto1);
        list.add(securityDto2);
        list.add(securityDto3);
        list.add(securityDto4);
        list.add(securityDto5);
        list.add(securityDto6);
        list.add(securityDto7);
        list.add(securityDto8);
        list.add(securityDto9);
        list.add(securityDto10);
        list.add(securityDto11);
        list.add(securityDto12);
        list.add(securityDto13);
        list.add(securityDto14);
        list.add(securityDto15);
        list.add(securityDto16);
        list.add(securityDto17);
        list.add(securityDto18);
        list.add(securityDto19);
        list.add(securityDto20);
        list.add(securityDto21);
        list.add(securityDto22);
        list.add(securityDto23);
        list.add(securityDto24);
        list.add(securityDto25);
        list.add(securityDto26);
        list.add(securityDto27);
        list.add(securityDto28);
        list.add(securityDto29);
        list.add(securityDto30);

        return list;
    }
}
