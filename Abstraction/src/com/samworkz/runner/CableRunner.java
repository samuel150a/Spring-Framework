package com.samworkz.runner;

import com.samworkz.external.Mike;
import com.samworkz.external.Speaker;
import com.samworkz.external.Tomoto;
import com.samworkz.internal.Cable;

public class CableRunner
{
    public static void main(String[] args) {
        Cable cable=new Speaker();
        cable.sound();

        Cable cable1=new Mike();
        cable1.sound();

        Tomoto tomoto=new Tomoto(cable);
                tomoto.display();

        Tomoto tomoto1=new Tomoto(cable1); // loose coupling
        tomoto1.display();


    }
}
