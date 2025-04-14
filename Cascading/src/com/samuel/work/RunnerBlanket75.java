package com.samuel.work;

public class RunnerBlanket75 {
    public static void main(String[] args) {
        Blanket75 blanket = new Blanket75();
        blanket.use(); // PARENT CLASS METHOD

        Blanket75 woolBlanket = new WoolBlanket75();
        woolBlanket.use(); // RUNTIME POLYMORPHISM

        WoolBlanket75 wb = new WoolBlanket75();
        wb.use(); // CHILD CLASS METHOD
        wb.warmUp();

        BeddingShop shop = new BeddingShop();
        shop.show(blanket);
        shop.show(wb);
    }
}
