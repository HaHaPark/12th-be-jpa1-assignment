package com.example.blog.domain.user.dto;

import com.example.blog.domain.user.domain.User;

public record UserReq(

        String username,
        String phone,
        String password


) {
    public User toEntity() {
        return User.builder()

                .username(username)
                .phone(phone)
                .password(password)
                .build();
    }
}