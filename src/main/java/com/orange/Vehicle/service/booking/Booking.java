package com.orange.Vehicle.service.booking;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.booking.BookingDTO;
import org.springframework.http.ResponseEntity;

public interface Booking {
    ResponseEntity<ResponseDTO> booking(BookingDTO booking);
    ResponseEntity<ResponseDTO> getUserAllServiceHistory();
    ResponseEntity<ResponseDTO> getUserAllServiceHistoryByUser(String userId);
}
