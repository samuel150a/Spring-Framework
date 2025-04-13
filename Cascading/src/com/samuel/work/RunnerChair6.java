package com.samuel.work;

public class RunnerChair6 {
    public static void main(String[] args) {
        Chair6 chair = new Chair6();
        chair.sitOn(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Chair6 officeChair = new OfficeChair6();
        officeChair.sitOn(); // RUNTIME POLYMORPHISM

        OfficeChair6 oc6 = new OfficeChair6();
        oc6.sitOn(); // NORMALLY ACCESSING CHILD CLASS METHOD
        oc6.adjustHeight();

        ChairShop shop = new ChairShop();
        shop.show(chair);
        shop.show(oc6);
    }
}
