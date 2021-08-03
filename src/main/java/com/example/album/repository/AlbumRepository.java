package com.example.album.repository;

import com.example.album.model.Album;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepository {

    public Album getAlbum(){
        Album album = Album(albumId: 111, name: "Watermelon Sugar", description: "Harry Styles best song",
                coverPicUrl: "Watermelon" );
        return album;
    }
}
