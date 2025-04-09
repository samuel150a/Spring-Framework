package com.encapsulation1.internal2;


public class BadgeTester {
    public void badgeDisp() {
        Badge badge = new Badge();
        System.out.println("BadgeNameis" + badge.getBadgeName());
        System.out.println("IssuedByis" + badge.getIssuedBy());
        System.out.println("Coloris" + badge.getColor());
        System.out.println("YearIssuedis" + badge.getYearIssued());
        System.out.println("IsMetalis" + badge.getIsMetal());

        badge.setBadgeName("Excellence Badge");
        badge.setIssuedBy("Science Teacher");
        badge.setColor("Silver");
        badge.setYearIssued(2025);
        badge.setIsMetal(false);

        System.out.println("UpdatedBadgeNameis" + badge.getBadgeName());
        System.out.println("UpdatedIssuedByis" + badge.getIssuedBy());
        System.out.println("UpdatedColoris" + badge.getColor());
        System.out.println("UpdatedYearIssuedis" + badge.getYearIssued());
        System.out.println("UpdatedIsMetalis" + badge.getIsMetal());
    }
}
