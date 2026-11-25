/*
 * Name:       HuHao
 * Student ID: 1580820
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       LoginController.java  (Controller)
 */
package com.bit235huhao.wikiapp.controller;

import com.bit235huhao.wikiapp.model.User;
import com.bit235huhao.wikiapp.service.AuthService;
// HttpSession stores data for one visitor between requests (remembers who is logged in).
import jakarta.servlet.http.HttpSession;
// @Controller marks this class as a Spring MVC controller that returns view names.
import org.springframework.stereotype.Controller;
// Model carries data from the controller to the Thymeleaf template.
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// Controller layer: receives browser requests for the login pages and form.
@Controller
public class LoginController {

    // The service that validates the login (the controller does no validation itself).
    private final AuthService authService;

    // Constructor injection: Spring supplies the AuthService object.
    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    // GET /  -> send the visitor to the login page.
    // "redirect:" makes the browser make a new request to the given URL.
    @GetMapping("/")
    public String root() {
        return "redirect:/login";
    }

    // GET /login  -> show the login form.
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        // Put an empty User in the model; the form fields are bound to it (th:object).
        model.addAttribute("user", new User());
        // Returns the template name: templates/login.html
        return "login";
    }

    // POST /login  -> runs when the form is submitted.
    // @ModelAttribute fills a User object from the submitted username and password fields.
    @PostMapping("/login")
    public String processLogin(@ModelAttribute("user") User user, HttpSession session) {
        // Ask the service layer whether the credentials are valid.
        if (authService.authenticate(user)) {
            // Remember the logged in user for the following requests.
            session.setAttribute("loggedInUser", user.getUsername().trim());
            // Success: redirect to the welcome page.
            return "redirect:/welcome";
        }
        // Failure: redirect to the error page.
        return "redirect:/login-error";
    }

    // GET /login-error  -> show the error page.
    @GetMapping("/login-error")
    public String showLoginError() {
        // Returns the template name: templates/login-error.html
        return "login-error";
    }
}
