package com.codecool.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void shouldCreateUserWithName(){
        User user = new User("Viktor");
        String actualName = user.getName();
        assertEquals("Viktor", actualName);
    }

    @Test
    void shouldCreateEmptyExperienceList(){
        User user = new User("Viktor");
        assertEquals(0, user.getExperiences().size());
    }

    @Test
    void shouldCreateUserWithNameAndRole(){
        User user = new User("Viktor");
        String actualName = user.getName();
        assertEquals("Viktor", actualName);
    }
}
