package com.samuel.work;

public class RunnerSticker91 {
    public static void main(String[] args) {
        Sticker91 sticker = new Sticker91();
        sticker.peel(); // PARENT CLASS METHOD

        Sticker91 customSticker = new CustomSticker91();
        customSticker.peel(); // RUNTIME POLYMORPHISM

        CustomSticker91 cs = new CustomSticker91();
        cs.peel(); // CHILD CLASS METHOD
        cs.design();

        StickerStore store = new StickerStore();
        store.show(sticker);
        store.show(cs);
    }
}
