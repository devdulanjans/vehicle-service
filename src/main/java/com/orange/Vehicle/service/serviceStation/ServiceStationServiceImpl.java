package com.orange.Vehicle.service.serviceStation;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.serviceStation.ServiceStation;
import com.orange.Vehicle.repo.serviceStation.ServiceStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceStationServiceImpl implements ServiceStationService {

    @Autowired
    private ServiceStationRepository serviceStationRepository;

    ResponseDTO responseDTO = new ResponseDTO();

    @Override
    public ResponseEntity<ResponseDTO> registerStation(ServiceStation serviceStation) {
        System.out.println(serviceStationRepository.findByName(serviceStation.getName()).isPresent());

        if(serviceStationRepository.findByName(serviceStation.getName()).isPresent()){
            responseDTO.setCode("400");
            responseDTO.setMessage("this service station exist");
            responseDTO.setContent(null);
            return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
        } else {

            ServiceStation response = serviceStationRepository.save(serviceStation);
            responseDTO.setCode("200");
            responseDTO.setMessage("Record Successfully saved!");
            responseDTO.setContent(response);
            return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
        }

    }

    @Override
    public ResponseEntity<ResponseDTO> getAllData() {
        List<ServiceStation> allData = serviceStationRepository.findAll();
        responseDTO.setCode("200");
        responseDTO.setMessage("All service station data");
        responseDTO.setContent(allData);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<ResponseDTO> getSearchName(String stationName) {
        List<ServiceStation> serviceStationName = serviceStationRepository.findByNameStartingWith(stationName);
        responseDTO.setCode("200");
        responseDTO.setMessage("All service station data");
        responseDTO.setContent(serviceStationName);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<ResponseDTO> getSearchCategory(String category) {
        List<ServiceStation> serviceStationName = serviceStationRepository.findByCategory(category);
        responseDTO.setCode("200");
        responseDTO.setMessage("All service station data");
        responseDTO.setContent(serviceStationName);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<ResponseDTO> getSearchCategoryAndName(String category, String name) {
        List<ServiceStation> serviceStationName = serviceStationRepository.findByCategoryAndName(category, name);
        responseDTO.setCode("200");
        responseDTO.setMessage("All service station data");
        responseDTO.setContent(serviceStationName);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }


    @Override
    public ResponseEntity<ResponseDTO> deleteServiceStation(String id, ServiceStation serviceStation) {
        serviceStation.setId(id);
        serviceStation.setStatus("deactivated");
        ServiceStation response = serviceStationRepository.save(serviceStation);
        responseDTO.setCode("200");
        responseDTO.setMessage("All service station data");
        responseDTO.setContent(response);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<ResponseDTO> getStationsByOwnerId(String ownerId) {
        List<ServiceStation> stations = serviceStationRepository.findByOwnerId(ownerId);
        responseDTO.setCode("200");
        responseDTO.setMessage("Service stations for the given ownerId");
        responseDTO.setContent(stations);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    public ResponseEntity updateServiceStation(String id, ServiceStation updatedStation) {
        Optional<ServiceStation> existingStation = serviceStationRepository.findById(id);
        if (existingStation.isPresent()) {
            ServiceStation station = existingStation.get();
            station.setName(updatedStation.getName());
            station.setCategory(updatedStation.getCategory());
            station.setAddress(updatedStation.getAddress());
            station.setContact(updatedStation.getContact());
            station.setLocation(updatedStation.getLocation());
            station.setServicesOffered(updatedStation.getServicesOffered());
            station.setRegistration(updatedStation.getRegistration());
            station.setProfile(updatedStation.getProfile());
            station.setFacilities(updatedStation.getFacilities());
            station.setReviews(updatedStation.getReviews());
            station.setPromotions(updatedStation.getPromotions());
            station.setTeam(updatedStation.getTeam());
            station.setOwnerId(updatedStation.getOwnerId());
            station.setStatus(updatedStation.getStatus());
            station.setCapacity(updatedStation.getCapacity());
            serviceStationRepository.save(station);
            return ResponseEntity.ok("Service Station updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Service Station not found");
        }
    }
}
