package com.samuel.work;

public class PhoneShop {
    public PhoneShop() {
        System.out.println("Running the PhoneShop constructor");
    }

    public void show(iPhone45 phone) {
        if (phone != null) {
            phone.usePhone();
            if (phone instanceof iPhonePro45) {
                iPhonePro45 ref = (iPhonePro45) phone;
                ref.recordVideo();
            } else {
                System.out.println("iPhone45 is not an instance of iPhonePro45, cannot call cascaded method");
            }
        } else {
            System.out.println("iPhone45 is null");
        }
    }
}
