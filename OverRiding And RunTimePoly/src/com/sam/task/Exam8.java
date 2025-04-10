package com.sam.task;

public class Exam8 extends Pen {
    public Exam8()
    {
    System.out.println("Running in the Exam8 constructor");
    }
    @Override
    public  void ink()
    {
        System.out.println("ink method of public is running in the Parent class after implementation ");
    }

    public void lead()
    {
        System.out.println("Running in the public method lead");
    }

    public void paper()
    {
        System.out.println("Running in the paper method");
    }

}
