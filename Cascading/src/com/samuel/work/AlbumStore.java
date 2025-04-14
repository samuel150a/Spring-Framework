package com.samuel.work;

public class AlbumStore {
    public AlbumStore() {
        System.out.println("Running the AlbumStore constructor");
    }

    public void show(Album89 album) {
        if (album != null) {
            album.display();
            if (album instanceof PhotoAlbum89) {
                PhotoAlbum89 ref = (PhotoAlbum89) album;
                ref.addPhoto();
            } else {
                System.out.println("Album89 is not an instance of PhotoAlbum89, cannot call cascaded method");
            }
        } else {
            System.out.println("Album89 is null");
        }
    }
}
