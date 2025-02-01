package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.booking.BookingDTO;
import com.orange.Vehicle.service.booking.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    @Autowired
    private Booking booking;

    @PostMapping("/booking")
    public ResponseEntity<ResponseDTO> booking(@RequestBody BookingDTO bookingDTO){
        return booking.booking(bookingDTO);
    }

    @GetMapping("/getUserAllServiceHistory")
    public ResponseEntity<ResponseDTO> getUserAllServiceHistory(){
        return booking.getUserAllServiceHistory();
    }

}
