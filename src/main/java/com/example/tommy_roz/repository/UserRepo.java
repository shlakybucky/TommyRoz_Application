package com.example.tommy_roz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.tommy_roz.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
