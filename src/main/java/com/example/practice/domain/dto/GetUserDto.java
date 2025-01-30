package com.example.practice.domain.dto;
import lombok.Getter;

import java.time.LocalDateTime;

public class GetUserDto {

    private String email;
    private String password;
    private String name;

    public GetUserDto(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name =  name;
    }
}

