package com.example.projectregistrpeple.controller;


import com.example.projectregistrpeple.domain.User;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.patterns.FactoryUsers;
import com.example.projectregistrpeple.service.userservice.UserServiceInterface;
import com.example.projectregistrpeple.service.verifications.VerificationResponseClass;
import com.example.projectregistrpeple.service.verifications.VerificationResponseInterface;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Accessors
@Data
@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    VerificationResponseInterface verificationResponse;

    @Autowired
    UserServiceInterface userService;

    @ResponseBody
    @PostMapping("/registration") // API добавить пользователя
    public String test(ResponseUser responseUser, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {

        boolean check = verificationResponse.check(date);

        if(verificationResponse.check(date)==false) return "test";


        userService.AddUser(responseUser,date);


        return "test";

    }


}
