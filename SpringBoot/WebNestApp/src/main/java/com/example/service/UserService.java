package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public interface UserService {
    Integer register(User user);
    void update(User user);
    void delete(Integer id);
    User get(Integer id);
    User getByEmail(String email);
    User getByName(String name); // Added for username lookup
    List<User> listAll();
}