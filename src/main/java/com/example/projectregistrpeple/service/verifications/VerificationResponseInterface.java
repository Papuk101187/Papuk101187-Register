package com.example.projectregistrpeple.service.verifications;


import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.exception.WrongDataException;

import java.util.Date;


public interface VerificationResponseInterface {


    boolean check(ResponseUser responseUser);
}
