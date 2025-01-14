package com.example.practice.service;

import com.example.practice.entity.Post;
import com.example.practice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    //1.1
    //- save
    public void create(Post post) {
        postRepository.save(new Post(post));
    }

    //1.2
    //- get
    //- change

    //1.3
    //- delete
}
