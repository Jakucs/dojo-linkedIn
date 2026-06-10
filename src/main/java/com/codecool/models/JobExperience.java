package com.codecool.models;

import java.time.LocalDate;
import java.util.Set;

public class JobExperience {
    private LocalDate startDate;
    private int months;
    private Set<Technology> technologies;

    public JobExperience(LocalDate startDate){
        this.startDate = startDate;
    }

    public JobExperience(LocalDate startDate, int months, Set<Technology> technologies){
        this.startDate = startDate;
        this.months = months;
        this.technologies = technologies;
    }

    public void addTechnology(Technology technology){
        this.technologies.add(technology);
    }

    public void setMonths(int month){
        this.months = month;
    }

    public LocalDate getStartDate(){
        return this.startDate;
    }

    public int getMonths(){
        return this.months;
    }

    public Set<Technology> getTechnologies(){
        return this.technologies;
    }

}
