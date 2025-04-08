package com.access.specifier.internal;



public class Beach {

    public Beach() {


        System.out.println("Beach constructor is running");
    }
    public void swimming()
    {
        System.out.println("public method swimming is running");

    }
    void boating()
    {
        System.out.println("default package boating method  is running");

    }

    private void  surfing()
    {
        System.out.println("private method surfing  is running");

    }
}
