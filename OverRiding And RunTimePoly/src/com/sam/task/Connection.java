package com.sam.task;

public class Connection extends Pipe54 {
    public Connection(){
        super();
        System.out.println("running in the Connection Constructor");
    }

    @Override
    public void supply()
    {
        System.out.println("Running in the Supply Constructor");
    }



public void pvc()
{
    System.out.println("running in the pvc method ");
}
public void pvc1()
{
    System.out.println("running in the pvc1 method");
}


}

