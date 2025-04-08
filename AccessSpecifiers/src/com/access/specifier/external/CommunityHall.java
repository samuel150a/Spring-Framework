package com.access.specifier.external;



import com.access.specifier.internal.Church;

public class CommunityHall {
    public CommunityHall() {
        System.out.println("Running external CommunityHall constructor");
    }

    public void refreshmentsArea() {
        System.out.println("Running external refreshmentsArea method and calling public method from Church");
        Church church = new Church();
        church.prayer_hall();
    }
}

