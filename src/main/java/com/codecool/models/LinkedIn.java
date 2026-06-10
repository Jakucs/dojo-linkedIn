package com.codecool.models;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn {
    private List<User> users;

    public LinkedIn(List<User> users){
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        if(user==null){
            throw new IllegalArgumentException("User cannot be null!");
        }
        this.users.add(user);
    }

    public boolean userExists(User user){
        return this.users.contains(user);
    }

    public List<User> searchByTechnology(Technology technology){
        List<User> result = new ArrayList<>();
        for(User user: users){
            if(user.hasTechnology(technology)){
                result.add(user);
            }
        }
        return result;
    }

    public List<User> searchByRoleAndExperience(Role role, int minMonths){
        List<User> result = new ArrayList<>();
        for(User user : users){
            if(user.getRole() == role && user.getTotalExperienceInMonths() >= minMonths){
                result.add(user);
            }
        }
        return result;
    }
}
