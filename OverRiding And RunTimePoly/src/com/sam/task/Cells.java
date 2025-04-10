package com.sam.task;

public class Cells extends Skin {
    public Cells()
    {
        super();
        System.out.println("Cell constructor is running");

    }
    @Override
    public void Colors()
    {
        System.out.println(" Public method color is running after implementation in child class");
    }

    public void SkinCream()
    {
        System.out.println("Public method SkinCream is Running");
    }

    public void SkinTemp()
    {
        System.out.println("Public method SkinTemp is Running");

    }

}
