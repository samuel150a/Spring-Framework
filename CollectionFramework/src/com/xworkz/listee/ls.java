package com.xworkz.listee;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ls {
    public static void main(String[] args) {
        List<Integer> lis=new ArrayList<>();
        lis.add(11);
        lis.add(22);
        lis.add(33);
        lis.add(44);

        List<Integer> sub=lis.subList(0,3);
        System.out.println(sub);
        System.out.println(lis);

        Spliterator<Integer> splt1= lis.spliterator();
        Spliterator<Integer> splt2=splt1.trySplit();
        splt1.forEachRemaining(System.out::println);
        splt2.forEachRemaining(System.out::println);

    }
}
