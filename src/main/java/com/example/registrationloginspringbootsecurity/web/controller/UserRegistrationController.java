package com.example.registrationloginspringbootsecurity.web.controller;

import com.example.registrationloginspringbootsecurity.service.UserService;
import com.example.registrationloginspringbootsecurity.web.dto.UserRegistrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class UserRegistrationController {

    private final UserService userService;

    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}

