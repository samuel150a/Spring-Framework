package com.samworkz.external;

import com.samworkz.internal.LPGRegulator;

public class Hat {
    private LPGRegulator lpgRegulator;
    public Hat(LPGRegulator lpgRegulator){
        this.lpgRegulator=lpgRegulator;
    }
    public void display()
    {
        if(lpgRegulator!=null)
        {
            this.lpgRegulator.gas();
        }
        else {
            System.err.println("null");
        }
    }
}
