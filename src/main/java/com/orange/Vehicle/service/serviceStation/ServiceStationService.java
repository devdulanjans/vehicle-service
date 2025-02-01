package com.orange.Vehicle.service.serviceStation;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.serviceStation.ServiceStation;
import org.springframework.http.ResponseEntity;

public interface ServiceStationService {
    ResponseEntity<ResponseDTO> registerStation(ServiceStation serviceStation);
    ResponseEntity<ResponseDTO> getAllData();
    ResponseEntity<ResponseDTO> getSearchName(String stationName);
}
