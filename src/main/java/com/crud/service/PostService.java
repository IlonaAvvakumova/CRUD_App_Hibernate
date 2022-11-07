package com.crud.service;

import com.crud.model.Post;
import com.crud.repository.Hibernate.HiberPostRepository;
import com.crud.repository.PostRepository;

import java.util.List;

public class PostService {

    private final  PostRepository postRepository;

    public PostService(){
        this.postRepository = new HiberPostRepository();
    }
    public List<Post> getAll() {
        return null;
    }


    public Post getById(Integer integer) {
        return null;
    }


    public Post create(Post post) {
        return null;
    }


    public Post update(Post post) {
        return null;
    }


    public void deleteById(Integer id) {

    }

}
