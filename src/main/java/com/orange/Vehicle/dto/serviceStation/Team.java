package com.orange.Vehicle.dto.serviceStation;

import java.util.List;


public class Team {
    private List<Mechanic> mechanics;
    private int staffCount;

    public Team(){}

    public Team(List<Mechanic> mechanics, int staffCount) {
        this.mechanics = mechanics;
        this.staffCount = staffCount;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    @Override
    public String toString() {
        return "Team{" +
                "mechanics=" + mechanics +
                ", staffCount=" + staffCount +
                '}';
    }
}