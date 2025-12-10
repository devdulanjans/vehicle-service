package com.orange.Vehicle.controller;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.user.LoginRequestDTO;
import com.orange.Vehicle.dto.user.UserData;
import com.orange.Vehicle.service.userService.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
@CrossOrigin
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<ResponseDTO> signUp(@RequestBody UserData user){
        System.out.println("Calling This");
        return userService.signUp(user);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO){return userService.login(loginRequestDTO);}

    @PostMapping("/getAllUsers")
    public ResponseEntity<ResponseDTO> getAllUsers(){
        return userService.getAllUsers();
    }
}
