package com.orange.Vehicle.dto.booking;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "booking")
public class BookingDTO {
    private String id;
    private String userId;
    private String serviceStationId;
    private String serviceDetails;
    private LocalDateTime appointmentDate;
    private String status; // Pending, Confirmed, Cancelled

    public BookingDTO(){}

    public BookingDTO(String id, String userId, String serviceStationId, String serviceDetails, LocalDateTime appointmentDate, String status) {
        this.id = id;
        this.userId = userId;
        this.serviceStationId = serviceStationId;
        this.serviceDetails = serviceDetails;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getServiceStationId() {
        return serviceStationId;
    }

    public String getServiceDetails() {
        return serviceDetails;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setServiceStationId(String serviceStationId) {
        this.serviceStationId = serviceStationId;
    }

    public void setServiceDetails(String serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
