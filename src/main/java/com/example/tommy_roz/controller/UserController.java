package com.example.tommy_roz.controller;

import com.example.tommy_roz.dto.UserDto;
import com.example.tommy_roz.mapper.UserMapper;
import com.example.tommy_roz.model.User;
import com.example.tommy_roz.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
public class UserController {


@Autowired
    public UserController(UserServiceImpl userServiceImpl, UserMapper userMapper) {
        this.userServiceImpl = userServiceImpl;
        this.userMapper = userMapper;
    }

    private final UserServiceImpl userServiceImpl;
    private final UserMapper userMapper;




    @GetMapping
    public @ResponseBody List<UserDto> getAllUsers() {
        List<User> users = userServiceImpl.getAllUsers();
        return userMapper.toDto(users);
    }


    //tut ect' voprosiki naschyot Optional
//    @GetMapping(path = "/{user_id}")
//    public UserDto getUserById(@PathVariable Long id){
//        User user = userServiceImpl.getUserById(id);
//        return userMapper.toDto(user);
//    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto){
        User user = userMapper.fromDto(userDto);
        user = userServiceImpl.saveUser(user);
        return userMapper.toDto(user);
    }

    @PutMapping("/{user_id}")
    public UserDto updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
        User user = userMapper.fromDto(userDto);
        user = userServiceImpl.saveUser(user);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable Long id){
        userServiceImpl.deleteUser(id);
    }
}