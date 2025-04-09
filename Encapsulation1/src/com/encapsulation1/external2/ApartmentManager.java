package com.encapsulation1.external2;



import com.encapsulation1.internal2.Apartment;

public class ApartmentManager {
    public void manageDisp() {
        Apartment apartment = new Apartment();
        System.out.println("ApartmentNameis" + apartment.getName());
        System.out.println("Locationis" + apartment.getLocation());
        System.out.println("NumberOfFlatsis" + apartment.getNumberOfFlats());
        System.out.println("HasLiftis" + apartment.getHasLift());
        System.out.println("OwnerNameis" + apartment.getOwnerName());
    }
}
