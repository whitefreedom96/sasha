package com.example.demo.dto;

import com.example.demo.model.User;

public class UserDto {

    private String username;
    private String password;

    public UserDto(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
    }
}
