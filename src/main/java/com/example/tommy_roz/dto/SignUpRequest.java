package com.example.tommy_roz.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@AllArgsConstructor
@Data
public class SignUpRequest {
    @NotBlank(message = "Login is required")
    private String login;

    @Size(min = 6, message = "Password is required and must be at least 6 characters long")
    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Full name is required")
    private String fullName;

    @NotBlank(message = "Phone number is required")
    private String phone;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    public SignUpRequest(){}


}
