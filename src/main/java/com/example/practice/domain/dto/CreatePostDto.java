package com.example.practice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class CreatePostDto {

    private String title;
    private String text;
    private long writerId;

}
