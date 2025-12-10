package com.orange.Vehicle.dto.serviceStation;


public class Registration {
    private String registrationId;
    private String licenseNumber;

    public Registration() {
    }

    public Registration(String registrationId, String licenseNumber) {
        this.registrationId = registrationId;
        this.licenseNumber = licenseNumber;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId='" + registrationId + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}