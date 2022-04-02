package com.example.projectregistrpeple.domain.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Accessors(chain = true)
@Data
@Entity
@Table(name = "users")
public class Users  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Long id;

    @Column(name = "user_name")
    public String name;

    @Column(name = "user_surname")
    public String surname;

    @Column(name = "user_patronymic")
    public String patronymic;

    @Column(name = "user_type")
    public String type;




}
