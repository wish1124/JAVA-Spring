package com.example.practice.entity;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostController {
    private long id;
    private String title;
    private String text;
    private long writerId;
    private LocalDateTime createdAt;

    public PostController(long id, String title, String text, long writerId, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.writerId = writerId;
        this.createdAt = createdAt;
    }
}