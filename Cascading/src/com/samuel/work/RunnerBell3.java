package com.samuel.work;

public class RunnerBell3 {
    public static void main(String[] args) {
        Bell3 bell = new Bell3();
        bell.ringBell(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Bell3 ebell = new ElectricBell3();
        ebell.ringBell(); // RUNTIME POLYMORPHISM

        ElectricBell3 electricBell = new ElectricBell3();
        electricBell.ringBell(); // NORMALLY ACCESSING CHILD CLASS METHOD
        electricBell.chargeBattery();

        BellShop shop = new BellShop();
        shop.show(bell);
        shop.show(electricBell);
    }
}
