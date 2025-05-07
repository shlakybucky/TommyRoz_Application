package com.example.tommy_roz.service;

import com.example.tommy_roz.dto.SignUpRequest;
import com.example.tommy_roz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.tommy_roz.repository.UserRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void signUp(SignUpRequest signupRequest) {
        if (userRepository.findByLogin(signupRequest.getLogin()).isPresent()) {
            throw new RuntimeException("User with this name already exists");
        }
        User user = new User();
        user.setLogin(signupRequest.getLogin());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        user.setFullName(signupRequest.getFullName());
        user.setPhone(signupRequest.getPhone());
        user.setEmail(signupRequest.getEmail());
        user.setRole("ROLE_USER");

        userRepository.save(user);
    }
//    public void signUp(String login, String password, String fullName, String phone, String email) {
//        if (userRepository.findByLogin(login).isPresent()) {
//            throw new RuntimeException("User with this name already exists");
//        }
//        User user = new User();
//        user.setLogin(login);
//        user.setPassword(passwordEncoder.encode(password));
//        user.setFullName(fullName);
//        user.setPhone(phone);
//        user.setEmail(email);
//        user.setRole("ROLE_USER");
//
//        userRepository.save(user);
//    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByLogin(login);
        User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("User not found"));

        List<SimpleGrantedAuthority> authority = new ArrayList<>(); //why do i need collection here?
        authority.add(new SimpleGrantedAuthority(user.getRole()));

        return new org.springframework.security.core.userdetails.User(
                user.getLogin(),
                user.getPassword(),
                authority
        );
    }
}
