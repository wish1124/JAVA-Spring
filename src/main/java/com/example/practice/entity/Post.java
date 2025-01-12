package com.example.practice.entity;

// 1. id
// 2. title
// 3. text
// 4. createdAt
// 5. writerId

import java.time.LocalDateTime;

public class Post {

    private long id;
    private String title;
    private String text;
    private long writerId;
    private LocalDateTime createdAt;

    public Post(long id, String title,String text,long writerId,LocalDateTime createdAt){
        this.id = id;
        this.title = title;
        this.text = text;
        this.writerId = writerId;
        this.createdAt = createdAt;
    }


}
