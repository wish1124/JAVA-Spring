package com.example.practice.service;

import com.example.practice.domain.dto.CreatePostDto;
import com.example.practice.domain.entity.Post;
import com.example.practice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    //1.1
    //- save
    public void create(CreatePostDto dto) {

        Post post = Post.builder()
                .text(dto.getText())
                .title(dto.getTitle())
                .writerId(dto.getWriterId())
                .createdAt(LocalDateTime.now())
                .build();

        postRepository.save(post);
    }

    //1.2
    //- get
    //- change

    //1.3
    //- delete
}
