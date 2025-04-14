package com.samuel.work;

public class RunnerMacbook46 {
    public static void main(String[] args) {
        Macbook46 mac = new Macbook46();
        mac.bootUp(); // PARENT CLASS METHOD

        Macbook46 pro = new MacbookPro46();
        pro.bootUp(); // RUNTIME POLYMORPHISM

        MacbookPro46 mp46 = new MacbookPro46();
        mp46.bootUp(); // CHILD CLASS METHOD
        mp46.renderVideo();

        AppleStore store = new AppleStore();
        store.show(mac);
        store.show(mp46);
    }
}
