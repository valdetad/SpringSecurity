package com.example.SpringSecurity.data.dtos;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}

