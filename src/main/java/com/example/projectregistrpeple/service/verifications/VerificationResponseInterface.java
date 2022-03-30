package com.example.projectregistrpeple.service.verifications;


import com.example.projectregistrpeple.dto.ResponseUser;

import java.util.Date;

public interface VerificationResponseInterface {


    boolean check(ResponseUser responseUser, Date date);
}
