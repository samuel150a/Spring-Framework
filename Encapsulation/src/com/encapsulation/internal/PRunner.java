package com.encapsulation.internal;

import com.encapsulation.external.*;

public class PRunner {
    public static void main(String[] args) {
        PostOfficeTester postOfficeTester = new PostOfficeTester();
        postOfficeTester.postOfficeDisp();

        PostOfficeManager postOfficeManager = new PostOfficeManager();
        postOfficeManager.manageDisp();

        System.out.println("***************************************************");
    }
}
