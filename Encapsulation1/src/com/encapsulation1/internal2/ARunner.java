package com.encapsulation1.internal2;



import com.encapsulation1.external2.*;

public class ARunner {
    public static void main(String[] args) {
        ApartmentTester apartmentTester = new ApartmentTester();
        apartmentTester.apartmentDisp();

        ApartmentManager apartmentManager = new ApartmentManager();
        apartmentManager.manageDisp();

        System.out.println("***************************************************");
    }
}
