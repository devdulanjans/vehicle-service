package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.vehicle.Vehicle;
import com.orange.Vehicle.service.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/createVehicle")
    public ResponseEntity<ResponseDTO> createVehicle(@RequestBody Vehicle vehicleRegistrationDTO) {
        return vehicleService.saveVehicle( vehicleRegistrationDTO);
    }

    @GetMapping("/getAllVehicles")
    public ResponseEntity<ResponseDTO> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/getVehicleById/{userId}")
    public ResponseEntity<ResponseDTO> getVehicleById(@PathVariable String userId){
        return vehicleService.getVehicleById(userId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDTO> updateVehicle(@PathVariable String id, @RequestBody Vehicle vehicle) {
        return vehicleService.updateVehicle(id, vehicle);
    }
}
