package com.codecool.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JobExperienceTest {

    @Test
    void testConstructorWithStartDateOnly() {
        LocalDate date = LocalDate.of(2020, 01, 01);
        JobExperience exp = new JobExperience(date);

        assertEquals(date, exp.getStartDate());
        assertEquals(0, exp.getMonths());
    }

    @Test
    void testConstructorWithAllParams(){
        LocalDate date = LocalDate.of(2020, 1, 1);
        Set<Technology> techs = Set.of(Technology.JAVA, Technology.DOCKER);
        JobExperience exp = new JobExperience(date, 12, techs);

        assertEquals(date, exp.getStartDate());
        assertEquals(12, exp.getMonths());
        assertEquals(techs, exp.getTechnologies());
    }

    @Test
    void testAddTechnology(){
        LocalDate date = LocalDate.of(2020, 01, 01);
        Set<Technology> techs = new java.util.HashSet<>();
        JobExperience exp = new JobExperience(date, 12, techs);

        exp.addTechnology(Technology.REACT);

        assertTrue(exp.getTechnologies().contains(Technology.REACT));
    }
}