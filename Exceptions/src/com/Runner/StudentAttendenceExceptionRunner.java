package com.Runner;


import com.xworkz.StudentAttendenceException;

public class StudentAttendenceExceptionRunner {

    public static void main(String args[]) throws StudentAttendenceException {

        boolean present = false;


        if(present) {
            System.out.println("attended ");

        } else {
            throw new StudentAttendenceException("not attended");
        }
    }
}


