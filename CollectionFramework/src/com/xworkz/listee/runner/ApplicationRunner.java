package com.xworkz.listee.runner;

import com.xworkz.in.dto.ApplianceDto;
import com.xworkz.in.dto.FurnitureDto;
import com.xworkz.in.repository.ApplianceRepository;
import com.xworkz.in.repository.ApplianceRepositoryImple;
import com.xworkz.listee.dto.ApplicationDto;
import com.xworkz.listee.repository.ApplicationRepository;
import com.xworkz.listee.repository.ApplicationRepositoryImple;
import javafx.application.Application;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Character.getType;
import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applianceRepository=new ApplicationRepositoryImple();
        List<ApplicationDto> list= applianceRepository.findAll();

        Iterator<ApplicationDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            ApplicationDto applicationDto = iterator.next();
            System.out.println( applicationDto );

        }
        System.out.println("----------------------------------------");

        System.out.println("Find All Application by type");
        list.stream().filter((app->app.getType()== ApplicationDto.Type.TRAVEL)).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("find all by CreatedDate and order in descending order");
        list.stream().sorted(Comparator.comparing(ApplicationDto::getCreatedDate).reversed()).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Sort by size in desending order");
        list.stream().sorted(Comparator.comparing(ApplicationDto::getSize).reversed()).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Find version by name and type");
        list.stream().filter(app->app.getName().equalsIgnoreCase("Swiggy")&& app.getType()== ApplicationDto.Type.TRAVEL).map(ApplicationDto::getVersion).forEach(System.out::println);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Find Application by Free");
        list.stream().filter(app->app.isFree()).map(ApplicationDto::getName).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Find Application by Created date");

        list.stream().filter(app->app.getCreatedDate().equals( LocalDate.of(2012, 3, 15))).map(ApplicationDto::getName).forEach(System.out::println);

        System.out.println("Usage of List iterator and iterrator");
        System.out.println("size befor removing"+list.size());


        Iterator<ApplicationDto> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            ApplicationDto applicationDto = iterator1.next();
            if(applicationDto.getName().equals("Instagram"))
            {
                iterator1.remove();
                System.out.println("Istagram app has deleted");

            }

            System.out.println("size after removing"+list.size());
            System.out.println( applicationDto );
        }

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");



        System.out.println("size befor removing"+list.size());
        ListIterator<ApplicationDto> ls = list.listIterator(list.size());
        while (ls.hasPrevious()) {
            ApplicationDto applicationDto1 = ls.previous();

            if (applicationDto1.getName().equals("Goibibo")) {
                ls.remove();
                System.out.println("size after %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%removing"+list.size());
                System.out.println("Removed Application"+applicationDto1.getName());
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                ApplicationDto newapp=new ApplicationDto("CandyCrush", ApplicationDto.Version.V1_0, LocalDate.of(2010, 1, 10),45, ApplicationDto.Type.TRAVEL,true,6);
                ls.add(newapp);

                System.out.println(newapp.getName());
            }




            System.out.println(applicationDto1);

        }



    }
}
