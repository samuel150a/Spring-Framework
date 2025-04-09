package com.encapsulation1.internal2;

import com.encapsulation1.external2.*;

public class GRunner {
    public static void main(String[] args) {
        GarageTester garageTester = new GarageTester();
        garageTester.garageDisp();

        GarageManager garageManager = new GarageManager();
        garageManager.manageDisp();

        System.out.println("***************************************************");
    }
}
