package com.orange.Vehicle.repo.booking;

import com.orange.Vehicle.dto.booking.BookingDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepo extends MongoRepository<BookingDTO, String> {
}
