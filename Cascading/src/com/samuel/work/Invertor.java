package com.samuel.work;

public class Invertor extends Generator{
    public Invertor()
    {
        super();
        System.out.println("Running in the Invertor constructor");

    }

    @Override
    public void powerSupply()
    {
        System.out.println("Running in the public method powerSupply ");
    }


    public void running()
    {
        System.out.println("Running in the public method running");

    }

    public void service()
    {
        System.out.println("Running in the public method service");
    }
}
