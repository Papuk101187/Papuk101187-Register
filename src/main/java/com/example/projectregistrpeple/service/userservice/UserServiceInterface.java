package com.example.projectregistrpeple.service.userservice;


import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;

public interface UserServiceInterface {



    void AddUser(ResponseUser responseUser);


    Users findByName(String username);
}
