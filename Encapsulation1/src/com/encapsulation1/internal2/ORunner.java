package com.encapsulation1.internal2;




import com.encapsulation1.external2.*;

public class ORunner {
    public static void main(String[] args) {
        OccupationTester occupationTester = new OccupationTester();
        occupationTester.occupationDisp();

        OccupationManager occupationManager = new OccupationManager();
        occupationManager.manageDisp();

        System.out.println("***************************************************");
    }
}