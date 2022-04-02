package com.example.projectregistrpeple.repository.userrepository;

import com.example.projectregistrpeple.domain.users.Users;
import com.example.projectregistrpeple.dto.ResponseUser;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class UserRepositoryClass implements RepositoryInterface {


    private final SessionFactory sessionFactory;

    @Override
    public void addUser(Users users) {
        Session session = sessionFactory.openSession();
        session.save(users);
    }



    @Override
    public Optional<Users> findByUsers(ResponseUser users) {

        Session session  = sessionFactory.openSession();

        String name = users.getUsername();
        String surname = users.getSurname();
        String patronymic = users.getPatronymic();


        Optional<Users> optional = session.createQuery(
                "SELECT user FROM Users user " +
                        "where " +
                        "user.name=:name AND user.surname=:surname AND user.patronymic=:patronymic",
                        Users.class)
                .setParameter("name", name)
                .setParameter("surname", surname)
                .setParameter("patronymic", patronymic).list().stream().findFirst();

        System.out.println("optional "+optional);


        return optional;


    }





}
