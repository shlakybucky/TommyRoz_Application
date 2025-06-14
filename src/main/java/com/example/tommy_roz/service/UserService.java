package com.example.tommy_roz.service;

import com.example.tommy_roz.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(Long id);
//    public User getUserById(Long id);

    public User createUser(User user);

    public void deleteUser(Long id);

    public User saveUser(User user);
}
