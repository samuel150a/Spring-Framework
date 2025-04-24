package com.samworkz.external;

import com.samworkz.internal.UsbPort;

public class Monitor implements UsbPort {

    @Override
    public void connection() {
        System.out.println("running in the connection method1");

    }
}
