package com.orange.Vehicle.repo.vehicle;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.vehicle.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VehicleRepo extends MongoRepository<Vehicle, String> {
    List<Vehicle> findByUserId(String userId);
}
