package com.orange.Vehicle.dto.serviceStation;

public class Mechanic {
    private String name;
    private String expertise;

    public Mechanic(){}

    public Mechanic(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}