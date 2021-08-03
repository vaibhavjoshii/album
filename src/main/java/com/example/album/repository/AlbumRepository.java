package com.example.album.repository;

import com.example.album.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album("Watermelon Sugar", "Harry Styles best song",
                                "Watermelon" );
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album:albumList) {
            if (album.getAlbumId() == albumId) {
                return album;
            }
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }
}
