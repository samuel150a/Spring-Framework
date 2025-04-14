package com.samuel.work;

public class RunneriPhone45 {
    public static void main(String[] args) {
        iPhone45 phone = new iPhone45();
        phone.usePhone(); // NORMALLY ACCESSING PARENT CLASS METHOD

        iPhone45 proPhone = new iPhonePro45();
        proPhone.usePhone(); // RUNTIME POLYMORPHISM

        iPhonePro45 ipPro = new iPhonePro45();
        ipPro.usePhone(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ipPro.recordVideo();

        PhoneShop shop = new PhoneShop();
        shop.show(phone);
        shop.show(ipPro);
    }
}
