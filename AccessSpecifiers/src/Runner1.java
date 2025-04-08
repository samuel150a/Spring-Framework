import com.access.specifier.internal.TicketCounter;
import com.access.specifier.external.TicketCost;


public class Runner1 {
    public static void main(String[] args)
    {
        TicketCounter ticketcounter=new TicketCounter();
        ticketcounter.Access_Beach();


        TicketCost ticketcost=new TicketCost();
        ticketcost.SecondAccessing();


    }
}
