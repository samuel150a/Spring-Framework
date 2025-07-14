package com.xworkz.in.guest;

import sun.awt.geom.AreaOp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Guest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Samuel");
        set.add("mithun");
        set.add("suresh");
        set.add("George");
        set.add("Christopher");
        set.add("John");
        set.add("karthik");
        set.add("");

        System.out.println(set);
        boolean result = set.contains("Apple");
        System.out.println(result);

        int value = set.size();
        System.out.println(value);

       boolean Empty =set.isEmpty();
       System.out.println(Empty);

      boolean AfterRemoved= set.remove("Samuel");
        System.out.println(AfterRemoved);
        System.out.println(set);

        HashSet<String> set1=new HashSet<>();
        set1.add("Laptop");
        set1.add("Mobile");
        set1.add("headPhone");
        set1.add("Mouse");
        set1.add("KeyBoard");
        set1.add("Apple");
        System.out.println("Using hashset-----");

          System.out.println(set1);


        HashSet<String> set2 = new HashSet<>();
        set2.add("Mango");
        set2.add("Papaya");
        set2.add("Apple");

        set1.addAll(set2);
        System.out.println(set1);

        System.out.println(set1.retainAll(set2));

        System.out.println(set2.size());

        set1.clear();
        System.out.println(set1);

        System.out.println(set1.size());

        System.out.println("LinkedHashset----------");
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("JackFruit");
        fruits.add("Mango");
        fruits.add("Lichy");
        fruits.add("cherry");

        

    }
}
