package com.access.specifier.internal;

import com.access.specifier.internal.CombBox;
import com.access.specifier.external.CombShop;

public class RunnerComb {
    public static void main(String[] args) {
        CombBox combBox = new CombBox();
        combBox.accessComb();

        CombShop combShop = new CombShop();
        combShop.displayComb();
    }
}
