package com.example.practice.domain.entity;

// 1. id
// 2. title
// 3. text
// 4. createdAt
// 5. writerId

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Post(Post obj){
        this.title = obj.title;
        this.text = obj.text;
        this.writerId = obj.writerId;
    }


}
