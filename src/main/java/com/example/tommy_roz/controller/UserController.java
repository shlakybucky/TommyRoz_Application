//package controller;
//
//import repository.UserRepo;
//import model.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequestMapping(path="/user")
//public class UserController {
//    @Autowired
//    private UserRepo userRepository;
//
//    @PostMapping(path="/add")
//    public @ResponseBody String addNewUser (@RequestParam String fullName, @RequestParam String username, @RequestParam String phone, @RequestParam String email) {
//        User user = new User();
//        user.setFullName(fullName);
//        user.setUsername(username);
//        user.setPhone(phone);
//        user.setEmail(email);
//        userRepository.save(user);
//        return "Saved";
//    }
//
//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<User> getAllUsers(){
//        return userRepository.findAll();
//    }
//}