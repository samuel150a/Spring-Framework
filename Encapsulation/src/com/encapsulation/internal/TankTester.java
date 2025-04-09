package com.encapsulation.internal;

public class TankTester {
    public void tankDisp() {
        Tank tank = new Tank();
        System.out.println("Modelis" + tank.getModel());
        System.out.println("Countryis" + tank.getCountry());
        System.out.println("CrewSizeis" + tank.getCrewSize());
        System.out.println("IsArmoredis" + tank.getIsArmored());
        System.out.println("Purposeis" + tank.getPurpose());

        tank.setModel("M1 Abrams");
        tank.setCountry("USA");
        tank.setCrewSize(4);
        tank.setIsArmored(true);
        tank.setPurpose("Battlefield Assault");

        System.out.println("UpdatedModelis" + tank.getModel());
        System.out.println("UpdatedCountryis" + tank.getCountry());
        System.out.println("UpdatedCrewSizeis" + tank.getCrewSize());
        System.out.println("UpdatedIsArmoredis" + tank.getIsArmored());
        System.out.println("UpdatedPurposeis" + tank.getPurpose());
    }
}
