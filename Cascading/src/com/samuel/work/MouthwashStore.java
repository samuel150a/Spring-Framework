package com.samuel.work;

public class MouthwashStore {
    public MouthwashStore() {
        System.out.println("Running the MouthwashStore constructor");
    }

    public void show(Mouthwash81 mouthwash) {
        if (mouthwash != null) {
            mouthwash.use();
            if (mouthwash instanceof MintMouthwash81) {
                MintMouthwash81 ref = (MintMouthwash81) mouthwash;
                ref.freshen();
            } else {
                System.out.println("Mouthwash81 is not an instance of MintMouthwash81, cannot call cascaded method");
            }
        } else {
            System.out.println("Mouthwash81 is null");
        }
    }
}
