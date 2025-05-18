package com.orange.Vehicle.dto.serviceStation;

public class ReviewComment {
    private String name;
    private String date;
    private String comment;

    public ReviewComment(){}

    public ReviewComment(String name, String date, String comment) {
        this.name = name;
        this.date = date;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ReviewComment{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}