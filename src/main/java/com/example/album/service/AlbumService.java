package com.example.album.service;

import com.example.album.model.Album;
import com.example.album.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album getAlbum(){
        return albumRepository.getAlbum();
    }

    public List<Album> getAllAlbums() {
        return albumRepository.getAllAlbums();
    }

    public Album getAlbumById(int albumId) {
        return albumRepository.getAlbumById(albumId);
    }

    public Album saveAlbum(Album album) {
        return albumRepository.saveAlbum(album);
    }
}
