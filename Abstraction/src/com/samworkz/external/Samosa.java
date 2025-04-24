package com.samworkz.external;

import com.samworkz.internal.Nail;

public class Samosa {
    private Nail nail;

    public Samosa(Nail nail)
    {
        this.nail=nail;
    }
   public void display()
    {
        if(nail!=null)
        {
            this.nail.beat();
        }
        else {
            System.err.println("its null");
        }
    }
}
