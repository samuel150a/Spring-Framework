package com.sam.task;


public class Cricket3 extends Sports3 {
    public Cricket3()
    {
        super();
        System.out.println("Running in the Cricket3 constructor");
    }
    @Override
    public void indoor()
    {
        System.out.println("public method indoor is running child class");
    }

    public void bat()
    {
        System.out.println("public method bat is running");
    }

    public void ball()
    {
        System.out.println("public method ball is running");
    }

}

