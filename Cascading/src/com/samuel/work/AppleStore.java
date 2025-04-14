package com.samuel.work;

public class AppleStore {
    public AppleStore() {
        System.out.println("Running the AppleStore constructor");
    }

    public void show(Macbook46 mac) {
        if (mac != null) {
            mac.bootUp();
            if (mac instanceof MacbookPro46) {
                MacbookPro46 ref = (MacbookPro46) mac;
                ref.renderVideo();
            } else {
                System.out.println("Macbook46 is not an instance of MacbookPro46, cannot call cascaded method");
            }
        } else {
            System.out.println("Macbook46 is null");
        }
    }
}
