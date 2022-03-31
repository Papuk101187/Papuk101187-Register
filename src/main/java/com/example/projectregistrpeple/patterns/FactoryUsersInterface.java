package com.example.projectregistrpeple.patterns;

import com.example.projectregistrpeple.domain.users.TypeUser;
import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;

import java.util.Date;

public interface FactoryUsersInterface {



    public Users createUser(ResponseUser responseUser);







}
