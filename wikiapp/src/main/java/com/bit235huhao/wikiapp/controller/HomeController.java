/*
 * Name:       HuHao
 * Student ID: 1580820
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       HomeController.java  (Controller)
 */
package com.bit235huhao.wikiapp.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller layer: pages that are shown after a successful login.
@Controller
public class HomeController {

    // GET /welcome  -> show the welcome message to a logged in user.
    @GetMapping("/welcome")
    public String showWelcome(HttpSession session, Model model) {
        // Read who is logged in from the session (null if nobody has logged in).
        Object loggedInUser = session.getAttribute("loggedInUser");

        // Not logged in: send the visitor back to the login page.
        if (loggedInUser == null) {
            return "redirect:/login";
        }

        // Pass the username to the template so it can print the welcome message.
        model.addAttribute("username", loggedInUser.toString());
        // Returns the template name: templates/welcome.html
        return "welcome";
    }

    // GET /logout  -> end the session and go back to the login page.
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // Removes everything stored in the session, so the user is logged out.
        session.invalidate();
        return "redirect:/login";
    }
}
