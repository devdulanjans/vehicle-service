package com.orange.Vehicle.repo.user;

import com.orange.Vehicle.dto.user.UserData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserData, String> {
    Optional<UserData> findByEmail(String email);
    Optional<UserData> findByPhoneNumber(String phoneNumber);
}
