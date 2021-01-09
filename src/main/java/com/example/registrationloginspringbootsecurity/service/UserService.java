package com.example.registrationloginspringbootsecurity.service;

import com.example.registrationloginspringbootsecurity.model.User;
import com.example.registrationloginspringbootsecurity.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}
