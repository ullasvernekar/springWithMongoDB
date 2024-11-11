package com.ot.mongo.controller;

import com.ot.mongo.dto.User;
import com.ot.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/save")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}
