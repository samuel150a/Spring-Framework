package com.samuel.work;

public class MobileShop {
    public MobileShop() {
        System.out.println("Running the MobileShop constructor");
    }

    public void show(Phone10 phone) {
        if (phone != null) {
            phone.call();
            if (phone instanceof SmartPhone10) {
                SmartPhone10 ref = (SmartPhone10) phone;
                ref.browseInternet();
            } else {
                System.out.println("Phone10 is not an instance of SmartPhone10, cannot call cascaded method");
            }
        } else {
            System.out.println("Phone10 is null");
        }
    }
}
