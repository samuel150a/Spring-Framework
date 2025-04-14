package com.samuel.work;

public class RunnerCover85 {
    public static void main(String[] args) {
        Cover85 cover = new Cover85();
        cover.protect(); // PARENT CLASS METHOD

        Cover85 bookCover = new BookCover85();
        bookCover.protect(); // RUNTIME POLYMORPHISM

        BookCover85 bc = new BookCover85();
        bc.protect(); // CHILD CLASS METHOD
        bc.design();

        CoverStore store = new CoverStore();
        store.show(cover);
        store.show(bc);
    }
}
