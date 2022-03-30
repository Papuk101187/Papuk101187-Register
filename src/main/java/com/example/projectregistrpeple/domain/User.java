package com.example.projectregistrpeple.domain;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;


@Accessors(chain = true)
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Long id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_patronymic")
    private String patronymic;

    @Column(name = "user_date")
    private Date date;





}
