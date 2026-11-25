/*
 * Name:       Dean Hu
 * Student ID: <YOUR_STUDENT_ID>
 * Unit:       BIT235 Object Oriented Programming - Assessment 2 Part A
 * File:       WikiappApplicationTests.java  (checks that the Spring application starts)
 */
package com.bit235huhao.wikiapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Starts the whole Spring application context; the test fails if any bean cannot be created.
@SpringBootTest
class WikiappApplicationTests {

    @Test
    void contextLoads() {
    }
}
