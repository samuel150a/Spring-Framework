package com.encapsulation.internal;

import com.encapsulation.external.*;

public class mRunner {
    public static void main(String[] args) {
        MutantTester mutantTester = new MutantTester();
        mutantTester.mutantDisp();

        MutantManager mutantManager = new MutantManager();
        mutantManager.manageDisp();

        System.out.println("***************************************************");
    }
}