package com.example.ist412project.service;

import com.example.ist412project.model.UserInfo;
import com.example.ist412project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserInfo createUser(UserInfo user) {
        return userRepository.save(user);
    }

    @Override
    public UserInfo updateUser(UserInfo user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserInfo getUserById(long userId) {
        Optional<UserInfo> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }

    @Override
    public List<UserInfo> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public boolean validateUser(String username, String password) {
        UserInfo user = userRepository.findByUserNameAndPassword(username, password);
        return user != null; // User is considered validated if found
    }
}
