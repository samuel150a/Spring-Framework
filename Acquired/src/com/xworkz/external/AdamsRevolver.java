package com.xworkz.external;

import com.xworkz.internal.Revolver;

public class AdamsRevolver extends Revolver {

    public AdamsRevolver()
    {
        super();
        System.out.println("no-agrs adams constructor is running");

    }

// navu evaga AdamsResolver na protected hag sepcify maddidre

    // this Error thorsuthae java: AdamsRevolver() has protected access in com.xworkz.external.AdamsRevolver
// because navu different package endha protected constructor na accesses madokae agalla..
}

