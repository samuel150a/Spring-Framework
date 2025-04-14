package com.samuel.work;

public class RemoteStore {
    public RemoteStore() {
        System.out.println("Running the RemoteStore constructor");
    }

    public void show(Remote96 remote) {
        if (remote != null) {
            remote.control();
            if (remote instanceof SmartRemote96) {
                SmartRemote96 ref = (SmartRemote96) remote;
                ref.connectWiFi();
            } else {
                System.out.println("Remote96 is not an instance of SmartRemote96, cannot call cascaded method");
            }
        } else {
            System.out.println("Remote96 is null");
        }
    }
}
