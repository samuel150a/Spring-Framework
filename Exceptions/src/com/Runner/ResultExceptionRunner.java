package com.Runner;


import com.xworkz.ResultException;

public class ResultExceptionRunner {

    public static void main(String args[]) {

        boolean result = false;


        if(result) {
            System.out.println("pass ");

        } else {
            throw new ResultException("fail");
        }
    }
}

