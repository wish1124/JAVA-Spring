package com.example.practice.service;

import com.example.practice.domain.dto.CreatePostDto;
import com.example.practice.domain.dto.CreateUserDto;
import com.example.practice.domain.dto.GetPostDto;
import com.example.practice.domain.dto.GetUserDto;
import com.example.practice.domain.entity.Post;
import com.example.practice.domain.entity.User;
import com.example.practice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    //1. create & save
    public void create(CreateUserDto dto) {
        Post post = Post.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .name(dto.getName())
                .build();

        UserRepository.save(user);
    }

    //2. get User Entity
    public GetUserDto getUser(String email){
        Optional<Post> optionalPost = userRepository.findById(email);
        Post post = optionalPost.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        GetUserDto dto = new GetUserDto(user.getEmail(),user.getpassword(),user.getname());
        return dto;
    }
}
