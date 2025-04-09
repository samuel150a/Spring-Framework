package com.encapsulation1.internal2;


import com.encapsulation1.internal2.Badge;

public class BadgeAccess {
    public void manageDisp() {
        Badge badge = new Badge();
        System.out.println("BadgeNameis" + badge.getBadgeName());
        System.out.println("IssuedByis" + badge.getIssuedBy());
        System.out.println("Coloris" + badge.getColor());
        System.out.println("YearIssuedis" + badge.getYearIssued());
        System.out.println("IsMetalis" + badge.getIsMetal());
    }
}
