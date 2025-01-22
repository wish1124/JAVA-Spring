package com.example.practice.domain.entity;

import com.example.practice.domain.dto.CreateUserDto;
import com.example.practice.domain.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String email;

    String password;

    String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public User(CreateUserDto userDto, Role role) {
        this.email = userDto.getEmail();
        this.password = userDto.getPassword();
        this.name = userDto.getName();
        this.role = role;
    }

}
