package com.Runner;


import com.xworkz.ClimateException;

public class ClimateExceptionRunner {

    public static void main(String args[]) throws ClimateException {

        boolean sunny = false;


        if(sunny) {
            System.out.println("play cricket ");

        } else {
            throw new ClimateException("no cricket");
        }
    }
}

