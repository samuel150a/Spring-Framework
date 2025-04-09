package com.encapsulation1.internal2;



public class ApartmentTester {
    public void apartmentDisp() {
        Apartment apartment = new Apartment();
        System.out.println("ApartmentNameis" + apartment.getName());
        System.out.println("ApartmentLocationis" + apartment.getLocation());
        System.out.println("NumberOfFlatsis" + apartment.getNumberOfFlats());
        System.out.println("HasLiftis" + apartment.getHasLift());
        System.out.println("OwnerNameis" + apartment.getOwnerName());

        apartment.setName("sai");
        apartment.setLocation(" bommanahalli");
        apartment.setNumberOfFlats(80);
        apartment.setHasLift(false);
        apartment.setOwnerName("karthik");

        System.out.println("UpdatedApartmentNameis" + apartment.getName());
        System.out.println("UpdatedApartmentLocationis" + apartment.getLocation());
        System.out.println("UpdatedNumberOfFlatsis" + apartment.getNumberOfFlats());
        System.out.println("UpdatedHasLiftis" + apartment.getHasLift());
        System.out.println("UpdatedOwnerNameis" + apartment.getOwnerName());
    }
}
