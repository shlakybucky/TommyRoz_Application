package com.example.tommy_roz.controller;

import com.example.tommy_roz.model.User;
import com.example.tommy_roz.service.impl.UserServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

    private final UserServiceImpl userServiceImpl;


    @GetMapping(path = "/")
    public @ResponseBody List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }


    //tut ect' voprosiki naschyot Optional
    @GetMapping(path = "/{user_id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userServiceImpl.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userServiceImpl.createUser(user);
    }

//    @PutMapping("/{user_id}")
//    public User updateUser(@PathVariable Long id, @RequestBody User user){
//        user.setId(id);
//        return userServiceImpl.saveUser(user);
//    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable Long id){
        userServiceImpl.deleteUser(id);
    }
}