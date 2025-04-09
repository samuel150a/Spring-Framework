package com.encapsulation1.internal2;



import com.encapsulation1.external2.*;

public class BRunner {
    public static void main(String[] args) {
        BadgeTester badgeTester = new BadgeTester();
        badgeTester.badgeDisp();

        BadgeAccess badgeAccess = new BadgeAccess();
        badgeAccess.manageDisp();

        System.out.println("***************************************************");
    }
}
