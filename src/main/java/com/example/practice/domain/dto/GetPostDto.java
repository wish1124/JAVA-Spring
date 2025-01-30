package com.example.practice.domain.dto;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetPostDto {

    private Long id;
    private String title;
    private String text;
    private LocalDateTime createdAt;

    public GetPostDto(String title,String text,LocalDateTime createdAt,Long id){
        this.id = id;
        this.title = title;
        this.text =  text;
        this.createdAt = createdAt;
    }
}
