package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.serviceStation.ServiceStation;
import com.orange.Vehicle.service.serviceStation.ServiceStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/serviceStation")
@CrossOrigin
public class ServiceStationController {

    @Autowired
    private ServiceStationService serviceStationService;

    @PostMapping("/registerStation")
    public ResponseEntity registerStation(@RequestBody ServiceStation serviceStation){
        return serviceStationService.registerStation(serviceStation);
    }

    @GetMapping("/allServiceStation")
    public ResponseEntity allServiceStation(){
        return serviceStationService.getAllData();
    }

    @GetMapping("/stationName")
    public ResponseEntity serviceStationFind(@RequestParam String name){
        return serviceStationService.getSearchName(name);
    }
}
