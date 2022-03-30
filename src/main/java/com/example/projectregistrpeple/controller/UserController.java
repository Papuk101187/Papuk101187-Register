package com.example.projectregistrpeple.controller;


import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.service.userservice.UserServiceInterface;
import com.example.projectregistrpeple.service.verifications.VerificationResponseInterface;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
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

    VerificationResponseInterface verificationResponse;
    UserServiceInterface userServiceInterface;

    @ResponseBody
    @PostMapping("/registration") // API добавить пользователя
    public String test(ResponseUser responseUser, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {

        //if (verificationResponse.check(responseUser, date)) {

            //User user = new User()
            //    .setName(responseUser.getUsername())
            //   .setSurname(responseUser.getSurname())
            //   .setPatronymic(responseUser.getPatronymic())
            //   .setDate(date);

            //System.out.println("UserController.test "+user);

            //userServiceInterface.AddUser(user);


        //} else {
           // System.out.println("на случай если данные не валидные тут надо написать свой ексепшен");
        //}


        return "test";


    }


}
