package com.xworkz;

import java.util.Scanner;

public class Hello
{
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        System.out.println("thank you  "+name+" for entering name ");
    }
}
