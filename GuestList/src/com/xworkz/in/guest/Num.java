package com.xworkz.in.guest;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Num
{

    public static void main(String[] args) {
        LinkedList<Integer> num=new LinkedList<>();
        num.add(11);
        num.add(22);
        num.add(33);
        num.add(44);
        num.add(55);
        num.add(66);
        for(Integer n:num) {
            if (n > 50) {
                System.out.println(n);
            }
        }
            HashSet<Integer> num1=new HashSet<>(num);
            System.out.println("After adding elements to another collection");
            System.out.println(num1);
        }

    }

