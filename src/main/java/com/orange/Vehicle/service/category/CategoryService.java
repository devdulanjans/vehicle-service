package com.orange.Vehicle.service.category;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.category.CategoryRegistrationDTO;
import org.springframework.http.ResponseEntity;

public interface CategoryService {
    ResponseEntity<ResponseDTO> categoryRegister(CategoryRegistrationDTO categoryRegistrationDTO);
    ResponseEntity<ResponseDTO> getAllCategory();
}
