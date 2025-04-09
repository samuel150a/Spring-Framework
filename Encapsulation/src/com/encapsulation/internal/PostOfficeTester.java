package com.encapsulation.internal;

public class PostOfficeTester {
    public void postOfficeDisp() {
        PostOffice postOffice = new PostOffice();
        System.out.println("Nameis" + postOffice.getName());
        System.out.println("Locationis" + postOffice.getLocation());
        System.out.println("NumberOfEmployeesis" + postOffice.getNumberOfEmployees());
        System.out.println("HasATMis" + postOffice.getHasATM());
        System.out.println("PostMasteris" + postOffice.getPostMaster());

        postOffice.setName("Basaveshwara Post Office");
        postOffice.setLocation("Bangalore");
        postOffice.setNumberOfEmployees(35);
        postOffice.setHasATM(true);
        postOffice.setPostMaster("Mrs. Rekha");

        System.out.println("UpdatedNameis" + postOffice.getName());
        System.out.println("UpdatedLocationis" + postOffice.getLocation());
        System.out.println("UpdatedNumberOfEmployeesis" + postOffice.getNumberOfEmployees());
        System.out.println("UpdatedHasATMis" + postOffice.getHasATM());
        System.out.println("UpdatedPostMasteris" + postOffice.getPostMaster());
    }
}

