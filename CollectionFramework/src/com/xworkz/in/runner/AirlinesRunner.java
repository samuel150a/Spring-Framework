package com.xworkz.in.runner;

import com.xworkz.in.dto.AirlinesDto;
import com.xworkz.in.dto.LaptopDto;
import com.xworkz.in.repository.AirlinesRepository;
import com.xworkz.in.repository.AirlinesRepositoryImple;

import java.util.Collection;
import java.util.Iterator;

public class AirlinesRunner
{
    public static void main(String[] args) {
        AirlinesRepository airlinesRepository=new AirlinesRepositoryImple();
        Collection<AirlinesDto> collection=airlinesRepository.findAll();
        for(AirlinesDto airlinesDto:collection) {
            if (airlinesDto.isTicketBooked()) {
                System.out.println("Name: " + airlinesDto.getName());
                System.out.println("TicketPrice: " + airlinesDto.getTicketPrice());
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            }
        }

            Iterator<AirlinesDto> iterator=collection.iterator();
            while (iterator.hasNext())
            {
                AirlinesDto a=iterator.next();
                System.out.println(a);
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

            }



        }


    }

