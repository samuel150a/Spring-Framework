package com.encapsulation.internal;

public class KeyChainTester {
    public void keyChainDisp() {
        KeyChain keyChain = new KeyChain();
        System.out.println("Materialis" + keyChain.getMaterial());
        System.out.println("Coloris" + keyChain.getColor());
        System.out.println("NumberOfKeysis" + keyChain.getNumberOfKeys());
        System.out.println("HasNameTagis" + keyChain.getHasNameTag());
        System.out.println("OwnerNameis" + keyChain.getOwnerName());

        keyChain.setMaterial("Plastic");
        keyChain.setColor("Blue");
        keyChain.setNumberOfKeys(5);
        keyChain.setHasNameTag(false);
        keyChain.setOwnerName("Sneha");

        System.out.println("UpdatedMaterialis" + keyChain.getMaterial());
        System.out.println("UpdatedColoris" + keyChain.getColor());
        System.out.println("UpdatedNumberOfKeysis" + keyChain.getNumberOfKeys());
        System.out.println("UpdatedHasNameTagis" + keyChain.getHasNameTag());
        System.out.println("UpdatedOwnerNameis" + keyChain.getOwnerName());
    }
}
