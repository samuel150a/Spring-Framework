package com.encapsulation.internal;

import com.encapsulation.external.*;

public class Runner {
    public static void main(String[] args) {
        GymTester gymTester = new GymTester();
        gymTester.gymDisp();

        GymManager gymManager = new GymManager();
        gymManager.manageDisp();

        System.out.println("***************************************************");
    }
}

