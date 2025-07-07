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
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.getType;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applianceRepository=new ApplicationRepositoryImple();
        Collection<ApplicationDto> list= applianceRepository.findAll();

        Iterator<ApplicationDto> iterator = list.iterator();
        while (iterator.hasNext()) {
            ApplicationDto applicationDto = iterator.next();
            System.out.println( applicationDto );

        }
        System.out.println("----------------------------------------");

        System.out.println("Find All Application by type");
        list.stream().filter((app->app.getType()== ApplicationDto.Type.TRAVEL)).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("find all by CreatedDate and orger in descending order");
        list.stream().sorted(Comparator.comparing(ApplicationDto::getCreatedDate).reversed()).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Sort by size in desending order");
        list.stream().sorted(Comparator.comparing(ApplicationDto::getSize).reversed()).forEach(System.out::println);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Find version by name and type");
        list.stream().filter(app->app.getName().equalsIgnoreCase("Swiggy")&& app.getType()== ApplicationDto.Type.TRAVEL).map(ApplicationDto::getVersion).forEach(System.out::println);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Find Application by Free");
        list.stream().filter(app->app.isFree()).map(ApplicationDto::getName).forEach(System.out::println);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Find Application by Created date");
        list.stream().filter(app->app.getCreatedDate().equals( LocalDate.of(2012, 3, 15))).map(ApplicationDto::getName).forEach(System.out::println);





    }
}
