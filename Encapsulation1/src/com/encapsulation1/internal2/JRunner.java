package com.encapsulation1.internal2;


import com.encapsulation1.external2.*;

public class JRunner {
    public static void main(String[] args) {
        JetTester jetTester = new JetTester();
        jetTester.jetDisp();

        JetManager jetManager = new JetManager();
        jetManager.manageDisp();

        System.out.println("***************************************************");
    }
}
