package com.orange.Vehicle.dto.serviceStation;

public class Location {
    private double latitude;
    private double longitude;
    private String landmark;

    public Location() {
    }

    public Location(double latitude, double longitude, String landmark) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.landmark = landmark;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", landmark='" + landmark + '\'' +
                '}';
    }
}