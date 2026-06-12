package com.codecool.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class User {
    private String name;
    private Role role;
    private List<JobExperience> experiences;

    public User(String name){
        this.name = name;
        this.experiences = new ArrayList<>();
    }

    public User(String name, Role role){
        this.name = name;
        this.role = role;
        this.experiences = new ArrayList<>();
    }

    public User(String name, Role role, JobExperience experience){
        this.name = name;
        this.role = role;
        this.experiences = new ArrayList<>();
        this.experiences.add(experience);
    }

    public String getName(){
        return this.name;
    }

    public Role getRole(){
        return this.role;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public void addExperience(JobExperience experience){
        this.experiences.add(experience);
    }

    public List<JobExperience> getExperiences(){
        return Collections.unmodifiableList(this.experiences);
    }

    public int getUserExperiencesInMonths(){
        int months = 0;
        for(JobExperience experience:experiences){
            months += experience.getMonths();
        }
        return months;
    }

    public boolean checkHasTechnology(Technology technology){
        for(JobExperience experience : experiences){
            if(experience.getTechnologies().contains(technology)){
                return true;
            }
        }
        return false;
    }
}
