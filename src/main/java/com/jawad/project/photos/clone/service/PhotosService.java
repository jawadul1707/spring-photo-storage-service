package com.jawad.project.photos.clone.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.jawad.project.photos.clone.model.Photo;

@Service 
public class PhotosService {

    // private List<Photo> db = List.of(new Photo("1", "hello.jpg"));

    private Map<String, Photo> db = new HashMap<>() {
        {
            put("1", new Photo("1", "hello.jpg"));
            put("2", new Photo("2", "world.jpg"));
        }
    };

    public Collection<Photo> get() {
        return db.values();
    }

    public Photo get(String id) {
        return db.get(id);
    }

    public Photo remove(String id) {
        return db.remove(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setId(UUID.randomUUID().toString());
        photo.setFileName(fileName);
        photo.setContentType(contentType);
        photo.setData(data);
        db.put(photo.getId(), photo);
        return photo;
    }
    
}
