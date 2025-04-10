package com.access.specifier.internal;

import com.access.specifier.internal.CoinCounter;
import com.access.specifier.external.CoinValue;

public class CommonRunner {
    public static void main(String[] args) {
        CoinCounter coincounter = new CoinCounter();
        coincounter.accessCoin();

        CoinValue coinvalue = new CoinValue();
        coinvalue.secondAccessing();
    }
}
