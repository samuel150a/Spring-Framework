package com.Runner;


import com.xworkz.TestException;

public class TestExceptionRunner {

        public static void main(String args[]) throws TestException {

            boolean test = false;


            if(test) {
                System.out.println("write");

            } else {
                throw new TestException("leave");
            }
        }
    }


