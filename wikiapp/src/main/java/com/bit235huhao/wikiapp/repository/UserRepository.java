/*
 * Name:       Dean Hu
 * Student ID: <YOUR_STUDENT_ID>
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       UserRepository.java  (Repository)
 */
package com.bit235huhao.wikiapp.repository;

import com.bit235huhao.wikiapp.model.User;
// Optional is a container that either holds a value or is empty (avoids returning null).
import java.util.Optional;
// @Repository tells Spring this class is the data-access layer and creates one instance.
import org.springframework.stereotype.Repository;

// Repository layer: the only place that knows where user data comes from.
// Part A has no database, so the single acceptable user is hard coded here.
@Repository
public class UserRepository {

    // Hard coded credentials: first name in lower case and 123 (assessment requirement).
    private static final String USERNAME = "huhao";
    private static final String PASSWORD = "123";

    // The one and only stored user, created once when the object is created.
    private final User storedUser = new User(USERNAME, PASSWORD);

    // Looks a user up by username. Returns the stored user if the name matches,
    // otherwise an empty Optional.
    public Optional<User> findByUsername(String username) {
        if (storedUser.getUsername().equals(username)) {
            return Optional.of(storedUser);
        }
        return Optional.empty();
    }
}
