package com.example.projectregistrpeple.domain.users;

import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Accessors
public class Customer implements Users {


    @Override
    public void active() {

    }

    public Customer(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Long id;

    @Column(name = "user_name")
    public String name;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_patronymic")
    private String patronymic;




}
