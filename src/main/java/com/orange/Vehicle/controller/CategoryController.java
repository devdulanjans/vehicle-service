package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.category.CategoryRegistrationDTO;
import com.orange.Vehicle.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

     @PostMapping("/categoryRegister")
     public ResponseEntity<ResponseDTO> categoryRegister(@RequestBody CategoryRegistrationDTO categoryRegistrationDTO){
         System.out.println(categoryRegistrationDTO);
         return categoryService.categoryRegister(categoryRegistrationDTO);
     }

     @GetMapping("/getAllCategory")
    public ResponseEntity<ResponseDTO> getAllCategory(){
         return categoryService.getAllCategory();
     }
}
