package com.samuel.work;

public class RunnerPhone10 {
    public static void main(String[] args) {
        Phone10 phone = new Phone10();
        phone.call(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Phone10 smartPhone = new SmartPhone10();
        smartPhone.call(); // RUNTIME POLYMORPHISM

        SmartPhone10 sp10 = new SmartPhone10();
        sp10.call(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sp10.browseInternet();

        MobileShop shop = new MobileShop();
        shop.show(phone);
        shop.show(sp10);
    }
}
