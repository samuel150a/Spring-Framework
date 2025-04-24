package com.samworkz.runner;

import com.samworkz.external.Cylinder;
import com.samworkz.external.GasPipe;
import com.samworkz.external.Hat;
import com.samworkz.internal.LPGRegulator;

public class LPGRegulatorRunner {
    public static void main(String[] args) {
        LPGRegulator lpgRegulator=new Cylinder();
        lpgRegulator.gas();

        LPGRegulator l1=new GasPipe();
        l1.gas();

        Hat hat=new Hat(lpgRegulator);
        hat.display();

        Hat hat1=new Hat(l1);//loose coupling
        hat1.display();



    }
}
