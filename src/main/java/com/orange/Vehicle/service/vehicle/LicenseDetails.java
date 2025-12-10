package com.orange.Vehicle.service.vehicle;

public class LicenseDetails {
    private String lastRenewalDate;
    private String nextRenewalDate;
    private String licenseNumber;
    private String documentUrl;

    public LicenseDetails() {
    }

    public LicenseDetails(String lastRenewalDate, String nextRenewalDate, String licenseNumber, String documentUrl) {
        this.lastRenewalDate = lastRenewalDate;
        this.nextRenewalDate = nextRenewalDate;
        this.licenseNumber = licenseNumber;
        this.documentUrl = documentUrl;
    }

    public String getLastRenewalDate() {
        return lastRenewalDate;
    }

    public void setLastRenewalDate(String lastRenewalDate) {
        this.lastRenewalDate = lastRenewalDate;
    }

    public String getNextRenewalDate() {
        return nextRenewalDate;
    }

    public void setNextRenewalDate(String nextRenewalDate) {
        this.nextRenewalDate = nextRenewalDate;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    @Override
    public String toString() {
        return "LicenseDetails{" +
                "lastRenewalDate='" + lastRenewalDate + '\'' +
                ", nextRenewalDate='" + nextRenewalDate + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", documentUrl='" + documentUrl + '\'' +
                '}';
    }
}
