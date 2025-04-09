package com.encapsulation.external;

import com.encapsulation.internal.Tank;

public class TankManager {
    public void manageDisp() {
        Tank tank = new Tank();
        System.out.println("Modelis" + tank.getModel());
        System.out.println("Countryis" + tank.getCountry());
        System.out.println("CrewSizeis" + tank.getCrewSize());
        System.out.println("IsArmoredis" + tank.getIsArmored());
        System.out.println("Purposeis" + tank.getPurpose());
    }
}
