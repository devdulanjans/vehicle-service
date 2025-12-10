package com.orange.Vehicle.service.vehicle;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.vehicle.Vehicle;
import com.orange.Vehicle.repo.vehicle.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    ResponseDTO responseDTO = new ResponseDTO();

    @Override
    public ResponseEntity<ResponseDTO> saveVehicle(Vehicle vehicle) {
        Vehicle response = vehicleRepo.save(vehicle);
        responseDTO.setCode("200");
        responseDTO.setMessage("Vehicle saved successfully");
        responseDTO.setContent(response);
        return ResponseEntity.ok(responseDTO);
    }

    @Override
    public ResponseEntity<ResponseDTO> getAllVehicles() {
        List<Vehicle> response = vehicleRepo.findAll();
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully fetched the data");
        responseDTO.setContent(response);
        return ResponseEntity.ok(responseDTO);
    }

    @Override
    public ResponseEntity<ResponseDTO> getVehicleById(String userId) {
        List<Vehicle> response = vehicleRepo.findByUserId(userId);
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully fetched the data");
        responseDTO.setContent(response);
        return ResponseEntity.ok(responseDTO);
    }

    @Override
    public ResponseEntity<ResponseDTO> updateVehicle(String vehicleId, Vehicle vehicle) {
        vehicle.setId(vehicleId);
        Vehicle response = vehicleRepo.save(vehicle);
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully fetched the data");
        responseDTO.setContent(response);
        return ResponseEntity.ok(responseDTO);
    }
}
