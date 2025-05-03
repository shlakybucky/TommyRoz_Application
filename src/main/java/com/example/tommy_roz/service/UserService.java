//package service;
//
//import model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.*;
////import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import repository.UserRepo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    private UserRepo userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public void signUp(String username, String password, String fullName, String phone, String email){
//        Optional<User> userExists = userRepository.findByUserName(username);
//        if(userExists.isPresent()){
//            throw new RuntimeException("User with this name already exists");
//        }
//
//        String encodedPassword = passwordEncoder.encode(password);
//
//        User user = new User(username, encodedPassword, fullName, phone, email);
//        userRepository.save(user);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> userOptional = userRepository.findByUserName(username);
//        User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        List<SimpleGrantedAuthority> authority = new ArrayList<>(); //why do i need collection here?
//        authority.add(new SimpleGrantedAuthority(user.getRole()));
//
//        return new org.springframework.security.core.userdetails.User(
//                user.getUsername(),
//                user.getPassword(),
//                authority
//        );
//    }
//}
