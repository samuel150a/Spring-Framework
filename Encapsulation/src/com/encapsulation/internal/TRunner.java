package com.encapsulation.internal;

import com.encapsulation.external.*;

public class TRunner {
    public static void main(String[] args) {
        TankTester tankTester = new TankTester();
        tankTester.tankDisp();

        TankManager tankManager = new TankManager();
        tankManager.manageDisp();

        System.out.println("***************************************************");
    }
}
