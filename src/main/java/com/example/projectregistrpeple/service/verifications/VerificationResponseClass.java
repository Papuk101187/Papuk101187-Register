package com.example.projectregistrpeple.service.verifications;



import com.example.projectregistrpeple.dto.ResponseUser;
import org.springframework.stereotype.Service;


@Service
public class VerificationResponseClass implements VerificationResponseInterface {


    @Override
    public boolean check(ResponseUser responseUser) {


        // тут надо доделать проверку имени , фамилии, отчества на наличие цифр


        return true;


    }


}
