package com.orange.Vehicle.dto.serviceStation;


public class Profile {
    private String logoUrl;
    private String about;

    public Profile() {
    }

    public Profile(String logoUrl, String about) {
        this.logoUrl = logoUrl;
        this.about = about;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "logoUrl='" + logoUrl + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}