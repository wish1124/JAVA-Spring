package com.example.practice.controller;

import com.example.practice.domain.dto.CreatePostDto;
import com.example.practice.domain.dto.CreateUserDto;
import com.example.practice.domain.dto.GetPostDto;
import com.example.practice.domain.dto.GetUserDto;
import com.example.practice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //1. User Entity create
    @PostMapping
public ResponseEntity<Void> createUser (@RequestBody CreateUserDto dto){

    userService.create(dto);

    return ResponseEntity.ok().build();
}
    //2. get one (DTO)
    public ResponseEntity<GetUserDto> getPost(@PathVariable Long id) {

//        Type name = postService.getPost(id);

        GetUserDto user = userService.getUser(email);

        return ResponseEntity.ok().body();
    }
}
