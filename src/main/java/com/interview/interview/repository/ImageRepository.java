package com.interview.interview.repository;

import com.interview.interview.entity.ImageClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageClass,Integer> {

}
