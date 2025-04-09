package com.encapsulation.internal;

import com.encapsulation.external.*;

public class krunner {
    public static void main(String[] args) {
        KeyChainTester keyChainTester = new KeyChainTester();
        keyChainTester.keyChainDisp();

        KeyChainManager keyChainManager = new KeyChainManager();
        keyChainManager.manageDisp();

        System.out.println("***************************************************");
    }
}
