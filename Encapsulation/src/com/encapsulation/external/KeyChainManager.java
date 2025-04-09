package com.encapsulation.external;

import com.encapsulation.internal.KeyChain;

public class KeyChainManager {
    public void manageDisp() {
        KeyChain keyChain = new KeyChain();
        System.out.println("Materialis" + keyChain.getMaterial());
        System.out.println("Coloris" + keyChain.getColor());
        System.out.println("NumberOfKeysis" + keyChain.getNumberOfKeys());
        System.out.println("HasNameTagis" + keyChain.getHasNameTag());
        System.out.println("OwnerNameis" + keyChain.getOwnerName());
    }
}
