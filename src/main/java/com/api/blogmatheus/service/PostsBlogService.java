package com.api.blogmatheus.services;

import com.api.blogmatheus.models.PostsBlogModel;
import com.api.blogmatheus.repository.PostsBlogRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostsBlogService {
    @Autowired
    final PostsBlogRepository postsBlogRepository;

    public PostsBlogService(PostsBlogRepository postsBlogRepository) {
        this.postsBlogRepository = postsBlogRepository;
    }

    @Transactional
    public PostsBlogModel save (PostsBlogModel postsBlogModel){
        return postsBlogRepository.save(postsBlogModel);
    }

    public boolean existsByPost(String post) {
        return postsBlogRepository.existsByPost(post);
    }

    public Page<PostsBlogModel> listar(Pageable pageable) {
        return postsBlogRepository.findAll(pageable);
    }

    public Optional<PostsBlogModel> acharId(UUID id) {
        return postsBlogRepository.findById(id);
    }

    public void delete(PostsBlogModel postsBlogModel) {
        postsBlogRepository.delete(postsBlogModel);
    }
}