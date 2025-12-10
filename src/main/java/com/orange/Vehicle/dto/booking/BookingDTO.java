package com.orange.Vehicle.dto.booking;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "booking")
public class BookingDTO {
    private String id;
    private String userId;
    private String serviceStationId;
    private String serviceDetails;
    private String appointmentDate;
    private String appointmentTime;
    private String serviceType;
    private String paymentMethod; // Paid, Unpaid
    private String vehicleId;
    private String status; // Pending, Confirmed, Cancelled

    public BookingDTO(){}

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public BookingDTO(String id, String userId, String serviceStationId, String serviceDetails, String appointmentDate, String appointmentTime, String serviceType, String paymentMethod, String vehicleId, String status) {
        this.id = id;
        this.userId = userId;
        this.serviceStationId = serviceStationId;
        this.serviceDetails = serviceDetails;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.serviceType = serviceType;
        this.paymentMethod = paymentMethod;
        this.vehicleId = vehicleId;
        this.status = status;
    }

    public BookingDTO(String id, String userId, String serviceStationId, String serviceDetails, String appointmentDate, String status) {
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

    public String getAppointmentDate() {
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

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
