package com.xworkz.task2.dataimple;

import com.xworkz.task2.dto.CeoDto;
import com.xworkz.task2.dto.CompanyNameDto;

import java.util.LinkedList;
import java.util.List;

public class CompanyNameList {

    public CompanyNameList() {
        System.out.println("running in the CompanyNameList constructor");
    }

    public List<CompanyNameDto> getCompanyNameList() {
        System.out.println("Running in the getCompanyNameList method");

        List<CompanyNameDto> list = new LinkedList<>();

        CeoList ceoList = new CeoList();
        List<CeoDto> ceoGet = ceoList.getCeoList();

        CompanyNameDto company1 = new CompanyNameDto("Infosys", 20000, 4000, ceoGet.get(0));
        CompanyNameDto company2 = new CompanyNameDto("TCS", 25000, 4500, ceoGet.get(1));
        CompanyNameDto company3 = new CompanyNameDto("Wipro", 18000, 3500, ceoGet.get(2));
        CompanyNameDto company4 = new CompanyNameDto("Accenture", 30000, 5000, ceoGet.get(3));
        CompanyNameDto company5 = new CompanyNameDto("IBM", 22000, 4100, ceoGet.get(4));
        CompanyNameDto company6 = new CompanyNameDto("Capgemini", 19000, 3700, ceoGet.get(5));
        CompanyNameDto company7 = new CompanyNameDto("Oracle", 21000, 3900, ceoGet.get(6));
        CompanyNameDto company8 = new CompanyNameDto("Microsoft", 28000, 4600, ceoGet.get(7));
        CompanyNameDto company9 = new CompanyNameDto("Google", 27000, 4550, ceoGet.get(8));
        CompanyNameDto company10 = new CompanyNameDto("Amazon", 32000, 5100, ceoGet.get(9));
        CompanyNameDto company11 = new CompanyNameDto("Facebook", 24000, 4200, ceoGet.get(10));
        CompanyNameDto company12 = new CompanyNameDto("Apple", 26000, 4300, ceoGet.get(11));
        CompanyNameDto company13 = new CompanyNameDto("Samsung", 29000, 4700, ceoGet.get(12));
        CompanyNameDto company14 = new CompanyNameDto("Dell", 21000, 3850, ceoGet.get(13));
        CompanyNameDto company15 = new CompanyNameDto("HP", 19500, 3650, ceoGet.get(14));
        CompanyNameDto company16 = new CompanyNameDto("Cisco", 23000, 4050, ceoGet.get(15));
        CompanyNameDto company17 = new CompanyNameDto("HCL", 18500, 3600, ceoGet.get(16));
        CompanyNameDto company18 = new CompanyNameDto("Tech Mahindra", 20000, 3900, ceoGet.get(17));
        CompanyNameDto company19 = new CompanyNameDto("Mindtree", 17000, 3400, ceoGet.get(18));
        CompanyNameDto company20 = new CompanyNameDto("Zoho", 16000, 3300, ceoGet.get(19));
        CompanyNameDto company21 = new CompanyNameDto("Adobe", 24000, 4200, ceoGet.get(20));
        CompanyNameDto company22 = new CompanyNameDto("Salesforce", 25000, 4400, ceoGet.get(21));
        CompanyNameDto company23 = new CompanyNameDto("PayPal", 20000, 3700, ceoGet.get(22));
        CompanyNameDto company24 = new CompanyNameDto("Flipkart", 21000, 3800, ceoGet.get(23));
        CompanyNameDto company25 = new CompanyNameDto("Snapdeal", 16000, 3100, ceoGet.get(24));
        CompanyNameDto company26 = new CompanyNameDto("Ola", 18000, 3450, ceoGet.get(25));
        CompanyNameDto company27 = new CompanyNameDto("Uber", 22000, 3950, ceoGet.get(26));
        CompanyNameDto company28 = new CompanyNameDto("Swiggy", 17500, 3500, ceoGet.get(27));
        CompanyNameDto company29 = new CompanyNameDto("Zomato", 18500, 3600, ceoGet.get(28));
        CompanyNameDto company30 = new CompanyNameDto("Byju’s", 19000, 3700, ceoGet.get(29));

        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        list.add(company8);
        list.add(company9);
        list.add(company10);
        list.add(company11);
        list.add(company12);
        list.add(company13);
        list.add(company14);
        list.add(company15);
        list.add(company16);
        list.add(company17);
        list.add(company18);
        list.add(company19);
        list.add(company20);
        list.add(company21);
        list.add(company22);
        list.add(company23);
        list.add(company24);
        list.add(company25);
        list.add(company26);
        list.add(company27);
        list.add(company28);
        list.add(company29);
        list.add(company30);

        return list;
    }
}
