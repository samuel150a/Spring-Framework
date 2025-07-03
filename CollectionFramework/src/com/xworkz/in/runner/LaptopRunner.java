package com.xworkz.in.runner;

import com.xworkz.in.dto.LaptopDto;
import com.xworkz.in.repository.LaptopRepository;
import com.xworkz.in.repository.LaptopRepositoryImple;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class LaptopRunner {
    public static void main(String[] args) {

        LaptopRepository repo = new LaptopRepositoryImple();
        Collection<LaptopDto> collection = repo.findAll();
        for (LaptopDto laptopDto : collection) {
            if (laptopDto.isIstouchDisplay()) {
                System.out.println("brand" + laptopDto.getBrand());
                System.out.println("Cost: " + laptopDto.getCost());
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%55");

            }
        }


        Iterator<LaptopDto> iterator = collection.iterator();

            while (iterator.hasNext()) {
                LaptopDto la = iterator.next();
                System.out.println("list  " + la);
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%55");
            }
            collection.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
