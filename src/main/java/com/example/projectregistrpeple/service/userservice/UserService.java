package com.example.projectregistrpeple.service.userservice;

import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;
import com.example.projectregistrpeple.repository.userrepository.MainUserRepositoryInterfaceJPA;
import com.example.projectregistrpeple.repository.userrepository.RepositoryInterface;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Accessors(chain = true)
public class UserService implements UserServiceInterface {

    @Autowired
    RepositoryInterface repositoryInterface;

    @Autowired
    MainUserRepositoryInterfaceJPA repositoryInterfaceJPA;


    @Override
    public void AddUser(ResponseUser responseUser) {

        Users users = new Users()
                .setName(responseUser.getUsername())
                .setSurname(responseUser.getSurname())
                .setPatronymic(responseUser.getPatronymic())
                .setType(responseUser.getType());

        repositoryInterface.addUser(users);

    }

    @Override
    public Users findByName(String username) {
      return repositoryInterfaceJPA.findByName(username);
    }


}
