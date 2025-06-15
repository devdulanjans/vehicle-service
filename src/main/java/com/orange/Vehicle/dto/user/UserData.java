package com.orange.Vehicle.dto.user;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userData")
public class UserData {
    private String id;
    private String email;
    private String phoneNumber;
    private String password;
    private String provider;
    private String name;
    private String role;

    // Default Constructor
    public UserData() {
    }

    // Parameterized Constructor
    public UserData(String id, String email, String phoneNumber, String password, String provider, String name, String role) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.provider = provider;
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", provider='" + provider + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
