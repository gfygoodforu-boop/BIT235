/*
 * Name:       HuHao
 * Student ID: 1580820
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       User.java  (Model)
 */
package com.bit235huhao.wikiapp.model;

// Model class: holds the username and password.
// It is used for the login form (the form fields are bound to this object)
// and also to represent the one hard coded user stored in the repository.
public class User {

    // Private fields (encapsulation): only reachable through the getters and setters.
    private String username;
    private String password;

    // No-argument constructor: Spring MVC uses it to create an empty User for the form.
    public User() {
    }

    // Constructor that sets both fields at once. 'this' refers to the current object.
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter: returns the username (Thymeleaf and Spring call it to read the value).
    public String getUsername() {
        return username;
    }

    // Setter: Spring calls it to copy the submitted form value into the object.
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
