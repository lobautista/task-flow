package com.luis.task_flow.controller;

import com.luis.task_flow.UserDto;
import com.luis.task_flow.entity.User;
import com.luis.task_flow.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody UserDto user) {
        return this.userService.register(user);
    }

}
