package com.encapsulation.external;

import com.encapsulation.internal.PostOffice;

public class PostOfficeManager {
    public void manageDisp() {
        PostOffice postOffice = new PostOffice();
        System.out.println("Nameis" + postOffice.getName());
        System.out.println("Locationis" + postOffice.getLocation());
        System.out.println("NumberOfEmployeesis" + postOffice.getNumberOfEmployees());
        System.out.println("HasATMis" + postOffice.getHasATM());
        System.out.println("PostMasteris" + postOffice.getPostMaster());
    }
}
