package com.example.registrationloginspringbootsecurity.service;

import com.example.registrationloginspringbootsecurity.model.Role;
import com.example.registrationloginspringbootsecurity.model.User;
import com.example.registrationloginspringbootsecurity.repository.UserRepository;
import com.example.registrationloginspringbootsecurity.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = User.builder()
                .firstName(registrationDto.getFirstName())
                .lastName(registrationDto.getLastName())
                .email(registrationDto.getEmail())
                .password(registrationDto.getPassword())
                .roles(Arrays.asList(Role.builder().name("ROLE_USER").build()))
                .build();
        return userRepository.save(user);
    }
}
