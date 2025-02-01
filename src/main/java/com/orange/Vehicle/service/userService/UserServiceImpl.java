package com.orange.Vehicle.service.userService;

import com.orange.Vehicle.dto.ResponseDTO;
import com.orange.Vehicle.dto.user.LoginRequestDTO;
import com.orange.Vehicle.dto.user.UserData;
import com.orange.Vehicle.repo.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    ResponseDTO responseDTO = new ResponseDTO();

    @Override
    public ResponseEntity<ResponseDTO> signUp(UserData user) {

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            responseDTO.setCode("400");
            responseDTO.setMessage("Email is already registered");
            responseDTO.setContent(null);
            return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
        }

        if (userRepository.findByPhoneNumber(user.getPhoneNumber()).isPresent()) {
            responseDTO.setCode("400");
            responseDTO.setMessage("Phone number is already registered");
            responseDTO.setContent(null);
            return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
        }


        UserData response = userRepository.save(user);
        responseDTO.setCode("200");
        responseDTO.setMessage("Successfully Registered the recors");
        responseDTO.setContent(response);

        return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<ResponseDTO> login(LoginRequestDTO credentials) {
//        user Not Found. PLease try with valid user
        try{
            Optional<UserData> userData = userRepository.findByEmail(credentials.getEmail());

            if(userData.isPresent()){

                UserData user = userData.get();

                System.out.println("CRED PASS: "+ credentials.getPassword());
                System.out.println("USER PASS: "+user.getPassword());

                if(user.getPassword().equals(credentials.getPassword())){
                    responseDTO.setCode("200");
                    responseDTO.setMessage("Login Successful");
                    responseDTO.setContent(user);
                    return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
                } else {
                    responseDTO.setCode("400");
                    responseDTO.setMessage("Invalid credential");
                    responseDTO.setContent(null);
                    return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
                }

            } else {
                responseDTO.setCode("404");
                responseDTO.setMessage("User not found");
                responseDTO.setContent(null);
                return ResponseEntity.status(404).body(responseDTO);
            }
        } catch (Exception e){
            responseDTO.setCode("500");
            responseDTO.setMessage("Internal Server Error: "+e.getMessage());
            responseDTO.setContent(null);
            return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
        }

    }

}
