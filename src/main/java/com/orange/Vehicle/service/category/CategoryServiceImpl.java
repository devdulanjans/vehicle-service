package com.orange.Vehicle.service.category;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.booking.BookingDTO;
import com.orange.Vehicle.dto.category.CategoryRegistrationDTO;
import com.orange.Vehicle.repo.category.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepo categoryRepo;;
    ResponseDTO responseDTO = new ResponseDTO();

    @Override
    public ResponseEntity<ResponseDTO> categoryRegister(CategoryRegistrationDTO categoryRegistrationDTO) {

        CategoryRegistrationDTO response = categoryRepo.save(categoryRegistrationDTO);
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully fetched the data");
        responseDTO.setContent(response);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);

    }

    @Override
    public ResponseEntity<ResponseDTO> getAllCategory() {
        List<CategoryRegistrationDTO> response = categoryRepo.findAll();
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully fetched the data");
        responseDTO.setContent(response);
        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }
}
