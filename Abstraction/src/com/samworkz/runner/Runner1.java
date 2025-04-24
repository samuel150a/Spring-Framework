package com.samworkz.runner;

import com.samworkz.external.*;
import com.samworkz.internal.Battery;
import com.samworkz.internal.UsbPort;

public class Runner1 {
    public static void main(String[] args) {
        Battery battery=new NegativeTerminal();
        battery.recharge();

        Battery battery1=new PostiveTerminal();
        battery1.recharge();

        BtyOutside btyOutside=new BtyOutside(battery);
        btyOutside.info1();

        BtyOutside btyOutside1=new BtyOutside(battery1);//loose coupling
        btyOutside1.info1();


        UsbPort usbport=new Monitor();
        usbport.connection();


         UsbPort usbport1=new Pendrive();
        usbport1.connection();

        UsOutside usOutside=new UsOutside(usbport);
                usOutside.info2();

        UsOutside usOutside1=new UsOutside(usbport1); //loose coupling
        usOutside1.info2();




    }
}
