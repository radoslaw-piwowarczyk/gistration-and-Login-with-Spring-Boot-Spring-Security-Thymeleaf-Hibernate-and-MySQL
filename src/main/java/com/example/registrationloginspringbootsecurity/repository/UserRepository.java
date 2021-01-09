package com.example.registrationloginspringbootsecurity.repository;

import com.example.registrationloginspringbootsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
