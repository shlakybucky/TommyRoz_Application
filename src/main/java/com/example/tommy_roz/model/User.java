package com.example.tommy_roz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

//import java.util.Collection;
//import java.util.Set;

@Entity
@Table(name = "users")
@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User  /*implements UserDetails*/ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    @Size(min = 4, message = "At least 4 characters")
    private String username;

    @Column(name = "password", nullable = false)
    @Size(min = 5, message = "At least 5 characters")
    private String password;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

//    @Column(name = "role", nullable = false)


//    @Transient
//    private String passwordConfirm;

//    @ManyToMany(fetch = FetchType.EAGER)
//    private Set<Role> roles;
//    private String role; //simple user or premium user

    //constructors
    public User() {
    }

//    @Override
//    public String getUsername() {
//        return login;
//    }
//
// //   @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
////    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
////    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
////    @Override
//    public boolean isEnabled() {
//        return true;
//    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return getRoles();
//    }

//    @Override
//    public String getPassword() {
//        return password;
//    }

//    public User(String fullName, String password, String login, String phone, String email) {
//        this.fullName = fullName;
//        this.password = password;
//        this.login = login;
//        this.phone = phone;
//        this.email = email;
//        this.role = "ROLE_USER";
//    }

    //getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public void setlogin(String fullName) {
//        this.login = login;
//    }
//
//    public String getlogin() {
//        return login;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        if (role == null || role.isEmpty()) {
//            this.role = "ROLE_USER";
//        } else {
//            this.role = role;
//        }
//    }

}

