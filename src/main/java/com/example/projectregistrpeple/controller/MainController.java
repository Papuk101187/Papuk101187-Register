package com.example.projectregistrpeple.controller;



import com.example.projectregistrpeple.service.userservice.UserServiceInterface;
import com.example.projectregistrpeple.service.verifications.VerificationResponseInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Accessors
@Data
@Controller
@RequiredArgsConstructor
public class MainController {

    VerificationResponseInterface verificationResponse;
    UserServiceInterface userServiceInterface;

    @GetMapping("")
    public String startMenu() {
        return "modelstart";
    }

    @GetMapping("/main")
    public String registraction() {
        return "main";
    }















}
