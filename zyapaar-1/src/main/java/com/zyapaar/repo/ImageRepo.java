package com.zyapaar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyapaar.model.Image;

@Repository
public interface ImageRepo extends JpaRepository<Image, Integer> {

}
