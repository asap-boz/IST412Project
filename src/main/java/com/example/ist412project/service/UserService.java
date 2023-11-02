package com.example.ist412project.service;

import com.example.ist412project.model.UserInfo;

import java.util.List;

public interface UserService {

    // Create a new user
    UserInfo createUser(UserInfo user);

    // Update an existing user
    UserInfo updateUser(UserInfo user);

    // Delete a user by their unique identifier
    void deleteUser(long userId);

    // Retrieve a user by their unique identifier
    UserInfo getUserById(long userId);

    // Retrieve all users
    List<UserInfo> getAllUsers();

     boolean validateUser(String username, String password);
}
