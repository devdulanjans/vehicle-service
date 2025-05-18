package com.orange.Vehicle.service.vehicle;

public class InsuranceDetails {
    private String provider;
    private String policyNumber;
    private String issueDate;
    private String expiryDate;
    private String documentUrl;

    public InsuranceDetails() {
    }

    public InsuranceDetails(String provider, String policyNumber, String issueDate, String expiryDate, String documentUrl) {
        this.provider = provider;
        this.policyNumber = policyNumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.documentUrl = documentUrl;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    @Override
    public String toString() {
        return "InsuranceDetails{" +
                "provider='" + provider + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", documentUrl='" + documentUrl + '\'' +
                '}';
    }
}
