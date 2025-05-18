package com.orange.Vehicle.dto.serviceStation;

public class ServiceItem {
    private String service;
    private double price;
    private String description;

    public ServiceItem() {
    }

    public ServiceItem(String service, double price, String description) {
        this.service = service;
        this.price = price;
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ServiceItem{" +
                "service='" + service + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}