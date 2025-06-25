package com.xworkz.in.runner;

import com.xworkz.in.dto.ApplianceDto;
import com.xworkz.in.repository.ApplianceRepository;
import com.xworkz.in.repository.ApplianceRepositoryImple;

import java.util.Collection;
import java.util.Iterator;

public class ApplianceRunner {


    public static void main(String[] args) {

        ApplianceRepository applianceRepository=new ApplianceRepositoryImple();
        Collection<ApplianceDto> collection=applianceRepository.findAll();

        System.out.println("List:");
        for(ApplianceDto applianceDto:collection)
        {
            if(applianceDto.isCostEfficient()) {
                System.out.println("Appliance name: " + applianceDto.getDomain());
                System.out.println("Brand: " + applianceDto.getBrand());

            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Iterator<ApplianceDto> iterator= collection.iterator();
        while(iterator.hasNext())
        {
            ApplianceDto applianceDto=iterator.next();
            System.out.println("Appliance name: "+applianceDto.getDomain());
            System.out.println("Brand: "+applianceDto.getBrand());
            System.out.println("Price: "+applianceDto.getRate());
            System.out.println("IsElectric: "+applianceDto.isCostEfficient());
            System.out.println("Category: "+applianceDto.getType());
            System.out.println("*********************************************************88");
        }
    }
}