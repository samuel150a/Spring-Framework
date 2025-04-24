package com.btm.extenal;

import com.btm.internal.Hospital;

public class Kaveri implements Hospital {
    @Override
   public void clean()
    {
        System.out.println("Running in abstract method after implementation");
    }
}

