package com.samworkz.runner;

import com.samworkz.external.BtyOutside;
import com.samworkz.external.NegativeTerminal;
import com.samworkz.external.PostiveTerminal;
import com.samworkz.internal.Battery;

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

    }
}
