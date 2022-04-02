package com.example.projectregistrpeple.repository.userrepository;

import com.example.projectregistrpeple.domain.users.Users;

public interface RepositoryInterface extends MainUserRepositoryInterface<Users ,String>  {



    void addUser(Users users);


}
