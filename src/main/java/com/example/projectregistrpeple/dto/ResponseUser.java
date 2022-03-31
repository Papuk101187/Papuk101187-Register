package com.example.projectregistrpeple.dto;


import lombok.Data;


import lombok.experimental.Accessors;

import java.util.Date;

@Accessors
@Data

public class ResponseUser {

    String username;
    String surname;
    String patronymic;
    String type;





}
