package com.luis.task_flow.builder;

import com.luis.task_flow.UserDto;
import com.luis.task_flow.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserBuilder {
    public User buildUser (UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }
}
