package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.serviceStation.ServiceStation;
import com.orange.Vehicle.service.serviceStation.ServiceStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/serviceStation")
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

    @GetMapping("/stationName/{id}")
    public ResponseEntity serviceStationFindByName(@PathVariable String id){
        return serviceStationService.getSearchName(id);
    }

    @GetMapping("/getServiceByCategory/{category}")
    public ResponseEntity getServiceByCategory(@PathVariable String category){
        return serviceStationService.getSearchCategory(category);
    }

    @GetMapping("/getServiceByCategoryAndName/{category}/{name}")
    public ResponseEntity getServiceByCategoryAndName(@PathVariable String category, @PathVariable String name){
        return serviceStationService.getSearchCategoryAndName(category, name);
    }

    @PutMapping("/deleteStation/{id}")
    public ResponseEntity updateStation(@PathVariable String id,@RequestBody ServiceStation serviceStation){
        return serviceStationService.deleteServiceStation(id,serviceStation);
    }

    @GetMapping("/getStationsByOwnerId/{ownerId}")
    public ResponseEntity getStationsByOwnerId(@PathVariable String ownerId) {
        return serviceStationService.getStationsByOwnerId(ownerId);
    }

    @PutMapping("/updateStation/{id}")
    public ResponseEntity updateServiceStation(@PathVariable String id, @RequestBody ServiceStation serviceStation) {
        System.out.println("serviceStation: "+serviceStation);
        System.out.println("serviceStation: "+id);
        return serviceStationService.updateServiceStation(id, serviceStation);
    }
}
