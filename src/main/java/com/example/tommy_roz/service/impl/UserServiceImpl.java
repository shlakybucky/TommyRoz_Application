package com.example.tommy_roz.service.impl;

import com.example.tommy_roz.exceptions.NotFoundException;
import com.example.tommy_roz.model.User;
import com.example.tommy_roz.repository.UserRepo;
import com.example.tommy_roz.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepository;

    public UserServiceImpl(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {//do i really need Optional here?
//        if (id == null) {
//            throw new IllegalArgumentException("Incorrect ID");
//        }
        return Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new NotFoundException("User with ID " + id + " not found")));
    }

        public User createUser (User user){
            return userRepository.save(user);
        }

        public void deleteUser (Long id){
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
            } else {
                throw new NotFoundException("User with ID " + id + " not found");
            }
        }
}

//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(Long id) {
//        return userRepository.findById(id).orElse(null);
//    }
//
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }
//}
