package com.example.projectregistrpeple.service.verifications;



import com.example.projectregistrpeple.dto.ResponseUser;
import org.springframework.stereotype.Service;



@Service
public class VerificationResponseClass implements VerificationResponseInterface {


    @Override
    public boolean check(ResponseUser responseUser) {




        return true;

    }





}
