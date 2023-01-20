package com.api.blogmatheus.repository;

import com.api.blogmatheus.models.PostsBlogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PostsBlogRepository extends JpaRepository<PostsBlogModel, UUID> {


    boolean existsByPost (String post);
}