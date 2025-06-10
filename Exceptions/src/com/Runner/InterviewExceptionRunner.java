package com.Runner;

import com.xworkz.InterviewException;

public class InterviewExceptionRunner {

    public static void main(String args[]) throws InterviewException {

        boolean list = false;


        if(list) {
            System.out.println("selected ");

        } else {
            throw new InterviewException("not selected");
        }
    }
}

