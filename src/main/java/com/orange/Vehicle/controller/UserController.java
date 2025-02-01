package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.user.LoginRequestDTO;
import com.orange.Vehicle.dto.user.UserData;
import com.orange.Vehicle.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<ResponseDTO> signUp(@RequestBody UserData user){
        return userService.signUp(user);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO){return userService.login(loginRequestDTO);}
}
