package com.example.practice.controller;

import com.example.practice.domain.dto.CreatePostDto;
import com.example.practice.domain.dto.GetPostDto;
import com.example.practice.domain.entity.Post;
import com.example.practice.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Bean, Component <- Controller, Service, Repository
// Bean Container = IoC(Inversion of Control) Container
@RestController
@Slf4j
@RequestMapping("/v1/api/posts")
public class PostController {

    // 1. Constructor
    @Autowired
    private PostService postService;


    @PostMapping
    public ResponseEntity<Void> createPost(@RequestBody CreatePostDto dto) {

        postService.create(dto);

        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<GetPostDto> getPost(@PathVariable Long id) {

//        Type name = postService.getPost(id);

        GetPostDto post = postService.getPost(id);

        return ResponseEntity.ok().body(post);
    }


}