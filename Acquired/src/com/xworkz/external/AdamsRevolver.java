package com.xworkz.external;

import com.xworkz.internal.Revolver;

public class AdamsRevolver extends Revolver {

    public AdamsRevolver()
    {
        System.out.println("no-agrs adams constructor is running");

    }
    public void Access1()

    {
        Revolver revolver = new AdamsRevolver();
    }
}

