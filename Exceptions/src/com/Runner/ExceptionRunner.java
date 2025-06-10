package com.Runner;

import com.xworkz.HealthIsuse;

public class ExceptionRunner {

    public static void main(String args[]) throws HealthIsuse {

        boolean health = false;


        if(health) {
            System.out.println("am good ");

        } else {
            throw new HealthIsuse("fever");
        }
    }
}

