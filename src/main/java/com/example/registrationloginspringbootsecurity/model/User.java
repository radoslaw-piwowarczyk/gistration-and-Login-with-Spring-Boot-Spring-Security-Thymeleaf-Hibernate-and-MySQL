package com.example.registrationloginspringbootsecurity.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Collection<Role> roles;


}
