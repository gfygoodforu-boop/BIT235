/*
 * Name:       HaoHu
 * Student ID: 1580820
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       WikiappApplication.java
 */
package com.bit235huhao.wikiapp;

// SpringApplication starts the embedded web server (Tomcat) and the Spring container.
import org.springframework.boot.SpringApplication;
// @SpringBootApplication switches on auto-configuration and component scanning.
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks this class as the entry point. Spring scans this package and all sub-packages
// (controller, service, repository, model) and registers the classes it finds there.
@SpringBootApplication
public class WikiappApplication {

    // The normal Java entry point of the program.
    public static void main(String[] args) {
        // Starts the application: web server on port 8080 plus all Spring beans.
        SpringApplication.run(WikiappApplication.class, args);
    }
}
