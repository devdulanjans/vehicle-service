package com.orange.Vehicle.dto.serviceStation;

import java.util.List;

public class Reviews {
    private double averageRating;
    private List<ReviewComment> comments;

    public Reviews() {
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<ReviewComment> getComments() {
        return comments;
    }

    public void setComments(List<ReviewComment> comments) {
        this.comments = comments;
    }

    public Reviews(double averageRating, List<ReviewComment> comments) {
        this.averageRating = averageRating;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "averageRating=" + averageRating +
                ", comments=" + comments +
                '}';
    }
}