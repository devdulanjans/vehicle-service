package com.orange.Vehicle.dto.vehicle;

import com.orange.Vehicle.service.vehicle.InsuranceDetails;
import com.orange.Vehicle.service.vehicle.LicenseDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicles")
public class Vehicle {
    @Id
    private String id;
    private String userId;
    private String type;
    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufactureYear;
    private String fuelType;
    private String status;
    private String imageUrl;

    private InsuranceDetails insurance;
    private LicenseDetails license;

    public Vehicle() {
    }

    public Vehicle(String id, String userId, String type, String brand, String model, String registrationNumber, String color, int manufactureYear, String fuelType, String status, String imageUrl, InsuranceDetails insurance, LicenseDetails license) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.fuelType = fuelType;
        this.status = status;
        this.imageUrl = imageUrl;
        this.insurance = insurance;
        this.license = license;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public InsuranceDetails getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceDetails insurance) {
        this.insurance = insurance;
    }

    public LicenseDetails getLicense() {
        return license;
    }

    public void setLicense(LicenseDetails license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", color='" + color + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", fuelType='" + fuelType + '\'' +
                ", status='" + status + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", insurance=" + insurance +
                ", license=" + license +
                '}';
    }
}