package com.samworkz.external;

import com.samworkz.internal.Battery;

public class PostiveTerminal implements Battery {

    @Override
    public void recharge() {
        System.out.println("Running in the Recharge method");
    }

}
