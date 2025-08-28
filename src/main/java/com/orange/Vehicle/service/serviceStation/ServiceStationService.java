package com.orange.Vehicle.service.serviceStation;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.serviceStation.ServiceStation;
import org.springframework.http.ResponseEntity;

public interface ServiceStationService {
    ResponseEntity<ResponseDTO> registerStation(ServiceStation serviceStation);
    ResponseEntity<ResponseDTO> getAllData();
    ResponseEntity<ResponseDTO> getSearchName(String stationName);
    ResponseEntity<ResponseDTO> getSearchCategory(String category);
    ResponseEntity<ResponseDTO> getSearchCategoryAndName(String category, String name);
    ResponseEntity<ResponseDTO> deleteServiceStation(String id, ServiceStation serviceStation);
    ResponseEntity<ResponseDTO> getStationsByOwnerId(String ownerId);
    ResponseEntity<ResponseDTO> updateServiceStation(String id, ServiceStation updatedStation);
}
