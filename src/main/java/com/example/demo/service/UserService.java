package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserService {

    public User save(User user);
    public Optional<User> findByPrimaryKey(Long id);
    public User getDetails(String username);
    public String getUserRoles(String username);
}
