package com.orange.Vehicle.service.userService;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.user.LoginRequestDTO;
import com.orange.Vehicle.dto.user.UserData;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<ResponseDTO> signUp(UserData user);
    ResponseEntity<ResponseDTO> login(LoginRequestDTO credentials);
}
