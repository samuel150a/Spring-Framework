package com.samuel.work;

public class RunnerRemote96 {
    public static void main(String[] args) {
        Remote96 remote = new Remote96();
        remote.control(); // PARENT CLASS METHOD

        Remote96 smartRemote = new SmartRemote96();
        smartRemote.control(); // RUNTIME POLYMORPHISM

        SmartRemote96 sr = new SmartRemote96();
        sr.control(); // CHILD CLASS METHOD
        sr.connectWiFi();

        RemoteStore store = new RemoteStore();
        store.show(remote);
        store.show(sr);
    }
}
