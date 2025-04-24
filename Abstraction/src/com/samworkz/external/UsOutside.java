package com.samworkz.external;

import com.samworkz.internal.UsbPort;

public class UsOutside
{
    private UsbPort usbport;
    public UsOutside(UsbPort usbport)
    {
        this.usbport=usbport;
    }
    public void info2()
    {
        if(usbport!=null)
        this.usbport.connection();
        else {
            System.err.println("its null");
        }
    }
}
