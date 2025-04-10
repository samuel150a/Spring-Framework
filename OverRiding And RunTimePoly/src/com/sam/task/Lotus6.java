package com.sam.task;

public class Lotus6 extends Flowers6{
    public Lotus6()
    {
        super();
        System.out.println("Running in the lotus6 Constructor");

    }
    @Override
    public void Smell()
    {
        System.out.println(" Running in the public method Smell in the parent class after implementation ");
    }

    public  void Petals()
    {
        System.out.println("running in the public method Petals");
    }

    public void Root()
    {
        System.out.println(" running in the public method Root");
    }
}
