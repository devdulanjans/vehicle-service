package com.orange.Vehicle.repo.category;

import com.orange.Vehicle.dto.category.CategoryRegistrationDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepo extends MongoRepository<CategoryRegistrationDTO, String> {
}
