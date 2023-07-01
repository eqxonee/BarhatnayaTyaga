package com.example.barhatnayatyaga.auth_and_register_services;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthOrRegisterService {
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

}
