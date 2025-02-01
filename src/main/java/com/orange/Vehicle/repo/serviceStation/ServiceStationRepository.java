package com.orange.Vehicle.repo.serviceStation;

import com.orange.Vehicle.dto.serviceStation.ServiceStation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ServiceStationRepository extends MongoRepository<ServiceStation, String> {
    Optional<ServiceStation> findByName(String name);

    @Query("{'name': { $regex: '^?0', $options: 'i' }}") // Case-insensitive search
    List<ServiceStation> findByNameStartingWith(String prefix);
}