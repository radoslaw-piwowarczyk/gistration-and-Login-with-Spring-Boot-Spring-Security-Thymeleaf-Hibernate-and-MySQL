package com.example.registrationloginspringbootsecurity.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@RequiredArgsConstructor
@Getter
@Setter
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Collection<Role> roles;


}
