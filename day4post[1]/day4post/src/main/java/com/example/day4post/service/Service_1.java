package com.example.day4post.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.day4post.model.User;
import com.example.day4post.repository.Repository;

@Service
public class Service_1 {

    @Autowired
    private Repository userRepository;

    // Create new user
    public User createUser(@NonNull User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by email
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Update user
    public User updateUser(String email, User user) {
        return userRepository.findByEmail(email)
                .map(existingUser -> {
                    existingUser.setUsername(user.getUsername());
                    existingUser.setEmail(user.getEmail());
                    existingUser.setPassword(user.getPassword());
                    existingUser.setFavoriteToy(user.getFavoriteToy());
                    existingUser.setAge(user.getAge());
                    return userRepository.save(existingUser);
                })
                .orElseThrow(() -> new RuntimeException("User not found with email: " + email));
    }

    // Remove user
    public void removeUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
