package com.Runner;


import com.xworkz.SummerSaleException;

public class SummerSaleExceptionRunner {

    public static void main(String args[]) throws SummerSaleException {

        boolean present = false;


        if(present) {
            System.out.println("purchase ");

        } else {
            throw new SummerSaleException("no purchase");
        }
    }
}

