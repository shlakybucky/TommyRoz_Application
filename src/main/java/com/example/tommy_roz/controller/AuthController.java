package com.example.tommy_roz.controller;

import com.example.tommy_roz.service.UserService;
import com.example.tommy_roz.dto.SignUpRequest;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;



@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(){
        return "login_form";
    }

    @PostMapping("/login")
    public String login(){
        //add login method
        return "Successfully signed in";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Model model){
        model.addAttribute("signUpRequest", new SignUpRequest());
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
    @PostMapping("/signup")
    public /*ResponseEntity<String>*/ String register(/*@RequestBody*/ @Valid @ModelAttribute("signUpRequest") SignUpRequest request,
                                                            BindingResult result,
                                                            Model model) {
        if(result.hasErrors()){
            return "sign_up_form";
        }
        try{
           userService.signUp(request);
           return "redirect:/auth/login";
        }catch(RuntimeException e){
            model.addAttribute("errorMessage", e.getMessage());
            return "sign_up_form";
        }

        //userService.signUp(request);
//        return ResponseEntity.ok("User is registered successfully");
    }

}
