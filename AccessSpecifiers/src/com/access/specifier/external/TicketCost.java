package com.access.specifier.external;
import com.access.specifier.internal.Beach;
public class TicketCost {

    public TicketCost(){
    System.out.println("TicketCostConstructor");
    }

    public void SecondAccessing()
    {
        Beach beach =new Beach();
        beach.swimming();
    }
}
