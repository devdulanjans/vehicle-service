package com.orange.Vehicle.service.booking;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.booking.BookingDTO;
import com.orange.Vehicle.repo.booking.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingImpl implements Booking{

    @Autowired
    private BookingRepo bookingRepo;

    ResponseDTO responseDTO = new ResponseDTO();
    @Override
    public ResponseEntity<ResponseDTO> booking(BookingDTO booking) {
        BookingDTO response = bookingRepo.save(booking);
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully Booking approved");
        responseDTO.setContent(response);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<ResponseDTO> getUserAllServiceHistory() {
        List<BookingDTO> response = bookingRepo.findAll();
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully fetched the data");
        responseDTO.setContent(response);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }
}
