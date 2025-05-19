package com.example.tommy_roz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;
import com.example.tommy_roz.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    public User findByUsername(String username);
    public User findByEmail(String email);
}
