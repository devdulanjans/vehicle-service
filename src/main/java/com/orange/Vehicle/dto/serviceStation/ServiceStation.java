package com.orange.Vehicle.dto.serviceStation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "service ")
public class ServiceStation {
    @Id
    private String id;

    private String category;
    private String name;
    private String address;
    private Contact contact;
    private Location location;
    private List<ServiceItem> servicesOffered;
    private Registration registration;
    private Profile profile;
    private Facilities facilities;
    private Reviews reviews;
    private List<Promotion> promotions;
    private Team team;
    private String ownerId; // Link to User
    private String status;
    private Capacity capacity;

    public ServiceStation(String id, String category, String name, String address, Contact contact, Location location, List<ServiceItem> servicesOffered, Registration registration, Profile profile, Facilities facilities, Reviews reviews, List<Promotion> promotions, Team team, String ownerId, String status, Capacity capacity) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.location = location;
        this.servicesOffered = servicesOffered;
        this.registration = registration;
        this.profile = profile;
        this.facilities = facilities;
        this.reviews = reviews;
        this.promotions = promotions;
        this.team = team;
        this.ownerId = ownerId;
        this.status = status;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<ServiceItem> getServicesOffered() {
        return servicesOffered;
    }

    public void setServicesOffered(List<ServiceItem> servicesOffered) {
        this.servicesOffered = servicesOffered;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", servicesOffered=" + servicesOffered +
                ", registration=" + registration +
                ", profile=" + profile +
                ", facilities=" + facilities +
                ", reviews=" + reviews +
                ", promotions=" + promotions +
                ", team=" + team +
                ", ownerId='" + ownerId + '\'' +
                ", status='" + status + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
