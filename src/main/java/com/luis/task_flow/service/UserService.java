package com.luis.task_flow.service;

import com.luis.task_flow.UserDto;
import com.luis.task_flow.builder.UserBuilder;
import com.luis.task_flow.entity.User;
import com.luis.task_flow.repository.UserRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log
public class UserService {
    private UserRepository userRepository;
    private UserBuilder userBuilder;

    @Autowired
    public UserService(UserRepository userRepository, UserBuilder userBuilder) {
        this.userRepository = userRepository;
        this.userBuilder = userBuilder;
    }

    public User register(UserDto userDto) {
        Optional<User> user = findUser(userDto);
        if (user.isEmpty()) {
            User userEntity = userBuilder.buildUser(userDto);
            return this.userRepository.save(userEntity);
        }
        return user.get();
    }

    private Optional<User> findUser (UserDto userDto) {
        return userRepository.findByEmail(userDto.getEmail());
    }
}
