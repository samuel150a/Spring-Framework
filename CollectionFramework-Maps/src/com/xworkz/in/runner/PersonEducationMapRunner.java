package com.xworkz.in.runner;

import com.xworkz.in.dto.PersonEducationMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonEducationMapRunner {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

                map.put("samuel","ece");
                map.put("danush","ece");
                map.put("peter","ece");
                map.put("john","ece");


        Set<Map.Entry<String,String>> entrySet= map.entrySet();
        entrySet.forEach(e->{
          System.out.println(e.getKey()+"  "+ e.getValue());
        });
    }
}
