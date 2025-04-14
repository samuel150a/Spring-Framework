package com.samuel.work;

public class PhotoAlbum89 extends Album89 {
    public PhotoAlbum89() {
        System.out.println("Running in the PhotoAlbum89 constructor");
    }

    @Override
    public void display() {
        System.out.println("Running public method display by child class");
    }

    public void addPhoto() {
        System.out.println("Running in public method addPhoto");
    }
}
