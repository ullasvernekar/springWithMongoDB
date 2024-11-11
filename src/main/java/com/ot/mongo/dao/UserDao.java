package com.ot.mongo.dao;

import com.ot.mongo.dto.User;
import com.ot.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}