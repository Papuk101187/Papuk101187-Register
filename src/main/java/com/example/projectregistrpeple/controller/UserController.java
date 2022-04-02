package com.example.projectregistrpeple.controller;

import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.service.userservice.UserServiceInterface;
import com.example.projectregistrpeple.service.verifications.VerificationResponseInterface;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Accessors
@Data
@Controller
@RequiredArgsConstructor
public class UserController  {

    @Autowired
    UserServiceInterface userService;

    @PostMapping("/registration") // API добавить пользователя
    public String registration(ResponseUser responseUser, Map<String, Object> model) {

        if (userService.findByName(responseUser.getUsername()) != null) {
            model.put("message", "Такой пользователь уже есть ");
            return "main";
        }else {

            userService.AddUser(responseUser);
            return "modelstart";
        }


    }


}
