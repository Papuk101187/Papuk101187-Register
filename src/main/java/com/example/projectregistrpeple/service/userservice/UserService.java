package com.example.projectregistrpeple.service.userservice;


import com.example.projectregistrpeple.domain.User;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.patterns.FactoryUsers;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService implements UserServiceInterface {

    FactoryUsers factoryUsers = new FactoryUsers();


    @Override
    public void AddUser(ResponseUser responseUser, Date date) {


    }


}
