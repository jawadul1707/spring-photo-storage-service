package com.jawad.project.photos.clone.repository;

import org.springframework.data.repository.CrudRepository;

import com.jawad.project.photos.clone.model.Photo;

public interface PhotosRepository extends CrudRepository<Photo,Integer> {

    
    
}
