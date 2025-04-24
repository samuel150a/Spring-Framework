package com.samworkz.external;

import com.samworkz.internal.Battery;

public class BtyOutside
{
    private Battery battery;
    public BtyOutside(Battery battery)
    {
        this.battery=battery;
    }

    public void info1() {
        if (battery != null) {
            this.battery.recharge();
        }
        else {
            System.err.println("its null");
        }
    }
}
