package com.samuel.work;

public class StickerStore {
    public StickerStore() {
        System.out.println("Running the StickerStore constructor");
    }

    public void show(Sticker91 sticker) {
        if (sticker != null) {
            sticker.peel();
            if (sticker instanceof CustomSticker91) {
                CustomSticker91 ref = (CustomSticker91) sticker;
                ref.design();
            } else {
                System.out.println("Sticker91 is not an instance of CustomSticker91, cannot call cascaded method");
            }
        } else {
            System.out.println("Sticker91 is null");
        }
    }
}
