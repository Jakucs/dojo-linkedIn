package com.codecool.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class JobExperience {
    private LocalDate startDate;
    private int months;
    private Set<Technology> technologies;

    public JobExperience(LocalDate startDate, int months, Set<Technology> technologies){
        this.startDate = startDate;
        this.months = months;
        this.technologies = new HashSet<>(technologies); //Másolatot készít
    }

    public JobExperience(LocalDate startDate){
        this.startDate = startDate;
        this.technologies = new HashSet<>();
    }

    public LocalDate getStartDate(){
        return this.startDate;
    }

    public int getMonths(){
        return this.months;
    }

    public Set<Technology> getTechnologies(){
         return new HashSet<>(this.technologies);
    }

    public void setDuration(int months){
        if(months<1){
            throw new IllegalArgumentException("Duration can't be negative.");
        }
        this.months = months;
    }

    public void addTechnology(Technology technology){
        this.technologies.add(technology);
    }


}
