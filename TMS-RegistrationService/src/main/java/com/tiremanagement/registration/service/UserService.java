package com.tiremanagement.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tiremanagement.registration.dto.UserRegistrationDto;
import com.tiremanagement.registration.entity.User;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
