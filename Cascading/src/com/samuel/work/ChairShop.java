package com.samuel.work;
public class ChairShop {
    public ChairShop() {
        System.out.println("Running the ChairShop constructor");
    }

    public void show(Chair6 chair) {
        if (chair != null) {
            chair.sitOn();
            if (chair instanceof OfficeChair6) {
                OfficeChair6 ref = (OfficeChair6) chair;
                ref.adjustHeight();
            } else {
                System.out.println("Chair6 is not an instance of OfficeChair6, cannot call cascaded method");
            }
        } else {
            System.out.println("Chair6 is null");
        }
    }
}
