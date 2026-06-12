package com.codecool.models;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn {
    private List<User> linkedInUsers;

    public LinkedIn(){
        this.linkedInUsers = new ArrayList<>();
    }

    public void addLinkedIn(User user){
        if(user==null){
            throw new IllegalArgumentException("user can't be null");
        }
            this.linkedInUsers.add(user);
    }

    public boolean checkUserExists(User user){
        if(user==null){
            throw new IllegalArgumentException("user can't be null");
        }

            for(User u: linkedInUsers){
                if(u.getName().equals(user.getName())){
                    return true;
                }
            }
        return false;
    }

    public List<User> searchUsersByTechnology(Technology technology){
        if(technology==null){
            throw new IllegalArgumentException("technology can't be null");
        }
        List<User> users = new ArrayList<>();
        for(User u: linkedInUsers){
            if(u.checkHasTechnology(technology)){
                users.add(u);
            }
        }
        return users;
    }

    public List<User> searchUsersByRoleAndMinimumYearsOfExperience(Role role, int yearsOfExperience){
        if(yearsOfExperience<=0){
            throw new IllegalArgumentException('year can t be null');
        }
        List<User> users = new ArrayList<>();
        int monthsOfExperience = yearsOfExperience*12;
        for(User u: linkedInUsers){
            if(u.getRole() == role && u.getUserExperiencesInMonths() >= monthsOfExperience){
                users.add(u);
            }
        }
        return users;
    }


}