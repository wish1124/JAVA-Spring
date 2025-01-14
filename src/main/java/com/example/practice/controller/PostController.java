package com.example.practice.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.example.practice.entity.Post;
import com.example.practice.service.PostService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@Setter
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    private ResponseEntity<?> createPost(@RequestBody Post post) {
        postService.create(post);
        return ResponseEntity.ok().build();
    }
}