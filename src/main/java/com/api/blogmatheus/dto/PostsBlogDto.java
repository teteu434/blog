package com.api.blogmatheus.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PostsBlogDto {
    @NotBlank
    @Size(max  = 140)
    private String post;
    @NotBlank
    @Size(max = 50)
    private String autor;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
