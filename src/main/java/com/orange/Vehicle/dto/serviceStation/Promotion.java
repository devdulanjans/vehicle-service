package com.orange.Vehicle.dto.serviceStation;


public class Promotion {
    private String title;
    private String details;

    public Promotion(){}

    public Promotion(String title, String details) {
        this.title = title;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}