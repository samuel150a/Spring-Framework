package com.Runner;

import com.xworkz.SurprisePicknicException;

public class SurprisePicknicExceptionRunner {

    public static void main(String args[]) throws SurprisePicknicException {

        boolean plan = false;


        if(plan) {
            System.out.println(" lets go ");

        } else {
            throw new SurprisePicknicException("lets cancel");
        }
    }
}


