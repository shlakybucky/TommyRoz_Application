package com.example.tommy_roz.controller;

import com.example.tommy_roz.service.UserService;
import com.example.tommy_roz.dto.SignUpRequest;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/auth/login")
    public String showLoginForm(){
        return "login_form";
    }

    @PostMapping("/auth/login")
    public String login(){
        //add login method
        return "Successfully signed in";
    }

    @GetMapping("/auth/signup")
    public String showSignUpForm(){
        return "sign_up_form";
    }

//    @PostMapping(path = "/auth/signup")
//    public @ResponseBody String addNewUser(@RequestParam String login,
//                                           @RequestParam String password,
//                                           @RequestParam String fullName,
//                                           @RequestParam String phone,
//                                           @RequestParam String email) {
//        userService.signUp(login, password, fullName, phone, email);
//        return "redirect:/auth/login";
//    }
    @PostMapping("/auth/signup")
    public ResponseEntity<String> register(@RequestBody @Valid SignUpRequest request) {
        userService.signUp(request);
        return ResponseEntity.ok("User is registered successfully");
    }

}
