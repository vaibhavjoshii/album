package com.example.album.service;

import com.example.album.model.Album;
import com.example.album.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;


    public Album getAlbum(){
        return albumRepository.getAlbum();
    }
}
