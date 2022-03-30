package com.example.projectregistrpeple.service.verifications;


import com.example.projectregistrpeple.dto.ResponseUser;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VerificationResponseClass implements VerificationResponseInterface{


    @Override
    public boolean check(ResponseUser responseUser, Date date) {
        return false;
    }


}
