package com.orange.Vehicle.dto.serviceStation;

public class Capacity {
    private int maxBookings;

    public Capacity() {
    }

    public Capacity(int maxBookings) {
        this.maxBookings = maxBookings;
    }

    public int getMaxBookings() {
        return maxBookings;
    }

    public void setMaxBookings(int maxBookings) {
        this.maxBookings = maxBookings;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "maxBookings=" + maxBookings +
                '}';
    }
}