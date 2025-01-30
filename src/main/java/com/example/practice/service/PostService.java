package com.example.practice.service;

import com.example.practice.domain.dto.CreatePostDto;
import com.example.practice.domain.dto.GetPostDto;
import com.example.practice.domain.entity.Post;
import com.example.practice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    public GetPostDto getPost(Long id){
        Optional<Post> optionalPost = postRepository.findById(id);
        Post post = optionalPost.orElseThrow(
                () -> new RuntimeException("Not Found")
        );

        GetPostDto dto = new GetPostDto(post.getTitle(),post.getText(),post.getCreatedAt(),post.getId());
        return dto;
    }

    //

}