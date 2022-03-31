package com.example.projectregistrpeple.patterns;

import com.example.projectregistrpeple.domain.users.Customer;
import com.example.projectregistrpeple.domain.users.Seller;
import com.example.projectregistrpeple.domain.users.TypeUser;
import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

import static com.example.projectregistrpeple.domain.users.TypeUser.*;

@Accessors
@Data
public class FactoryUsers implements FactoryUsersInterface {


    @Override
    public Users createUser(ResponseUser responseUser) {

        TypeUser typeUser = createType(responseUser);

        switch (typeUser) {

            case CUSTOMER:
                return new Customer(
                        responseUser.getUsername(),
                        responseUser.getSurname(),
                        responseUser.getPatronymic());
            case SELLER:
                return new Seller(
                        responseUser.getUsername(),
                        responseUser.getSurname(),
                        responseUser.getPatronymic());
        }

        return null; // тут надо прописать исключения на случай если не сможем сделать пользователяю
    }

    private TypeUser createType(ResponseUser responseUser) {

        TypeUser typeUser;
        switch (responseUser.getType()) {
            case "customer":
                return typeUser = CUSTOMER;
            case "seller":
                return typeUser = SELLER;

        }
        return null;
    }

}