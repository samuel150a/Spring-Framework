package com.sam.task;

public class Mango2 extends Fruit4 {
    public Mango2()
    {
        System.out.println("running in the  Mango2 Constructor");
    }
    @Override
    public  void taste()
    {
        System.out.println(" Running in the public method taste after the implementation");

    }

    public void raw()
    {
        System.out.println("Running in the public method call raw");
    }

    public void tree()
    {
        System.out.println("Running in the public method Tree");
    }

}
