package com.jawad.project.photos.clone.service;

//import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.jawad.project.photos.clone.model.Photo;
import com.jawad.project.photos.clone.repository.PhotosRepository;

@Service 
public class PhotosService {

    private final PhotosRepository photosRepository;

    // private List<Photo> db = List.of(new Photo("1", "hello.jpg"));

    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setFileName(fileName);
        photo.setContentType(contentType);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
    
}
