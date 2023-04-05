package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public User registerStudent(@RequestBody User user) {
        User userToSave = new User();
        userToSave.setName(user.getName());
        userToSave.setPassword(passwordEncoder.encode(user.getPassword()));
        userToSave.setRoles(user.getRoles());
        userToSave.setCreatedDate(new Date());
       // userToSave.setRoles(
        userToSave = userService.save(userToSave);
        return userToSave;
    }

    /**
     * User who has logged in successfully can access this API
     * @param username
     * @return
     */
    @GetMapping("/userInfo")
    public User getUserInfo(@RequestParam("name") String username) {
        return userService.getDetails(username);
    }

    /**
     * User who has the role ROLE_WRITE can only access this API
     * @param username
     * @return
     */
    @GetMapping("/getUserRoles")
    public String getUserRoles(@RequestParam("name") String username) {
        return userService.getUserRoles(username);
    }

}
