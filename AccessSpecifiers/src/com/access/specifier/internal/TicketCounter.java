package com.access.specifier.internal;

public class TicketCounter {

    public TicketCounter()
    {
        System.out.println("running in the TicketCounter constructor");

    }

    public void Access_Beach()
    {
        Beach beach=new Beach();
        beach.swimming();
        beach.boating();

    }

}
