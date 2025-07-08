package com.harsh.flickPass.controllers;

import com.harsh.flickPass.dtos.SignUpRequestDTO;
import com.harsh.flickPass.dtos.SignUpResponseDTO;
import com.harsh.flickPass.enums.ResponseStatus;
import com.harsh.flickPass.models.User;
import com.harsh.flickPass.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDTO signUp(SignUpRequestDTO requestDTO) {
        SignUpResponseDTO responseDTO = new SignUpResponseDTO();
        try {
            User user = userService.signUp(requestDTO.getEmail(), requestDTO.getPassword());
            responseDTO.setUserId(user.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
