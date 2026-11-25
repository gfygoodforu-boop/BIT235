/*
 * Name:       Dean Hu
 * Student ID: <YOUR_STUDENT_ID>
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       AuthServiceTest.java  (unit tests for the login validation)
 */
package com.bit235huhao.wikiapp.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.bit235huhao.wikiapp.model.User;
import com.bit235huhao.wikiapp.repository.UserRepository;
import org.junit.jupiter.api.Test;

// Plain unit tests: no Spring needed, the service is created by hand.
class AuthServiceTest {

    private final AuthService authService = new AuthService(new UserRepository());

    @Test
    void correctUsernameAndPasswordAreAccepted() {
        assertTrue(authService.authenticate(new User("huhao", "123")));
    }

    @Test
    void wrongPasswordIsRejected() {
        assertFalse(authService.authenticate(new User("huhao", "wrong")));
    }

    @Test
    void wrongUsernameIsRejected() {
        assertFalse(authService.authenticate(new User("bing", "123")));
    }

    @Test
    void emptyFieldsAreRejected() {
        assertFalse(authService.authenticate(new User("", "")));
        assertFalse(authService.authenticate(new User(null, null)));
    }
}
