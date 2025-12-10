package com.orange.Vehicle.service.vehicle;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.vehicle.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface VehicleService {
    ResponseEntity<ResponseDTO> saveVehicle(Vehicle vehicle);
    ResponseEntity<ResponseDTO> getAllVehicles();
    ResponseEntity<ResponseDTO> getVehicleById(String vehicleId);
    ResponseEntity<ResponseDTO> updateVehicle(String vehicleId, Vehicle vehicle);
}
