package com.example.practice.controller;

import com.example.practice.domain.dto.CreatePostDto;
import com.example.practice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Bean, Component <- Controller, Service, Repository
// Bean Container = IoC(Inversion of Control) Container
@RestController
// Wrong
//@Getter
//@Setter
//@RequiredArgsConstructor
@RequestMapping("/v1/api/post")
public class PostController {

    // 1. Constructor
    @Autowired
    private PostService postService;


//    public PostController(PostService postService) {
//        this.postService = postService;
//    }


    // Post Upload "/users"
    @PostMapping("/posts")
    private ResponseEntity<Void> createPost(
            @RequestBody CreatePostDto dto
    ) {

        postService.create(dto);
        return ResponseEntity.ok().build();
    }
}