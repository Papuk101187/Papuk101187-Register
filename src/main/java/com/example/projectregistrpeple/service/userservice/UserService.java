package com.example.projectregistrpeple.service.userservice;


import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.patterns.FactoryUsers;
import com.example.projectregistrpeple.repository.userrepository.MainUserRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    FactoryUsers factoryUsers = new FactoryUsers();

    @Autowired
    MainUserRepositoryInterface userRepositoryInterface;


    @Override
    public void AddUser(ResponseUser responseUser) {

        Users users = factoryUsers.createUser(responseUser);


    }


}
