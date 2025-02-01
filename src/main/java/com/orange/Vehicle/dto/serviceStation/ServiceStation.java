package com.orange.Vehicle.dto.serviceStation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "service ")
public class ServiceStation {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String servicesOffered; // Could be a JSON or a simple string
    private double longitude;
    private double latitude;
    private String ownerId; // Reference to the user who owns the station

    public ServiceStation(){}

    public ServiceStation(String id, String name, String address, String contact, String servicesOffered, double longitude, double latitude, String ownerId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.servicesOffered = servicesOffered;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ownerId = ownerId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getServicesOffered() {
        return servicesOffered;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setServicesOffered(String servicesOffered) {
        this.servicesOffered = servicesOffered;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", servicesOffered='" + servicesOffered + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", ownerId='" + ownerId + '\'' +
                '}';
    }
}
