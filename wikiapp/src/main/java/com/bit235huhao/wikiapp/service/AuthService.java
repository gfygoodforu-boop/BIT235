/*
 * Name:       HuHao
 * Student ID: 1580820
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       AuthService.java  (Service)
 */
package com.bit235huhao.wikiapp.service;

import com.bit235huhao.wikiapp.model.User;
import com.bit235huhao.wikiapp.repository.UserRepository;
import java.util.Optional;
// @Service tells Spring this class holds business logic and creates one instance.
import org.springframework.stereotype.Service;

// Service layer: contains the login validation logic.
// The controller only passes data in; this class decides if the login is valid.
@Service
public class AuthService {

    // The repository this service depends on (final = assigned once, in the constructor).
    private final UserRepository userRepository;

    // Constructor injection: Spring sees the parameter and supplies the UserRepository.
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Returns true only if the submitted username and password match the stored user.
    public boolean authenticate(User loginAttempt) {
        // Reject a missing object.
        if (loginAttempt == null) {
            return false;
        }

        String username = loginAttempt.getUsername();
        String password = loginAttempt.getPassword();

        // Reject empty fields before looking anything up.
        if (username == null || username.isBlank()
                || password == null || password.isBlank()) {
            return false;
        }

        // Ask the repository for the user with this name (trim removes stray spaces).
        Optional<User> stored = userRepository.findByUsername(username.trim());

        // Valid only if the user exists AND the password is exactly the same.
        return stored.isPresent() && stored.get().getPassword().equals(password);
    }
}
