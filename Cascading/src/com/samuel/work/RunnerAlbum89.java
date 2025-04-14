package com.samuel.work;

public class RunnerAlbum89 {
    public static void main(String[] args) {
        Album89 album = new Album89();
        album.display(); // PARENT CLASS METHOD

        Album89 photoAlbum = new PhotoAlbum89();
        photoAlbum.display(); // RUNTIME POLYMORPHISM

        PhotoAlbum89 pa = new PhotoAlbum89();
        pa.display(); // CHILD CLASS METHOD
        pa.addPhoto();

        AlbumStore store = new AlbumStore();
        store.show(album);
        store.show(pa);
    }
}
