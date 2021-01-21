package com.example.registrationloginspringbootsecurity.service;

import com.example.registrationloginspringbootsecurity.model.User;
import com.example.registrationloginspringbootsecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
