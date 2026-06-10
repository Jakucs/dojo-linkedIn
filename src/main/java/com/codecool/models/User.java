package com.codecool.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class User {
    private String name;
    private Role role;
    private final List<JobExperience> experiences;

    User(String name){
        this.name = name;
        this.experiences = new ArrayList<>();
    }

    User(String name, Role role){
        this.name = name;
        this.role = role;
        this.experiences = new ArrayList<>();
    }

    User(String name, Role role, List<JobExperience> experiences){
        this.name = name;
        this.role = role;
        this.experiences = experiences;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public void addExperiences(JobExperience experience){
        this.experiences.add(experience);
    }

    public String getName(){
        return this.name;
    }

    public Role getRole(){
        return this.role;
    }

    public List<JobExperience> getExperiences(){
        return Collections.unmodifiableList(experiences);
    }

    public int getTotalExperienceInMonths(){
        int total = 0;
        for(JobExperience exp: experiences){
            total+=exp.getMonths();
        }
        return total;
    }

    public boolean hasTechnology(Technology technology){
        for(JobExperience exp: experiences){
            if(exp.getTechnologies().contains((technology))){
                return true;
            }
        }
        return false;
    }
}
