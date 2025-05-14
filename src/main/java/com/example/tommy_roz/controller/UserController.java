package com.example.tommy_roz.controller;

import com.example.tommy_roz.repository.UserRepo;
import com.example.tommy_roz.model.User;

import com.example.tommy_roz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }
}