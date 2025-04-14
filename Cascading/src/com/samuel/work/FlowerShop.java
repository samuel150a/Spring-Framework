package com.samuel.work;

public class FlowerShop {
    public FlowerShop() {
        System.out.println("Running the FlowerShop constructor");
    }

    public void show(Sunflower90 sunflower) {
        if (sunflower != null) {
            sunflower.bloom();
            if (sunflower instanceof YellowSunflower90) {
                YellowSunflower90 ref = (YellowSunflower90) sunflower;
                ref.grow();
            } else {
                System.out.println("Sunflower90 is not an instance of YellowSunflower90, cannot call cascaded method");
            }
        } else {
            System.out.println("Sunflower90 is null");
        }
    }
}
