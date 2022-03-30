package com.example.projectregistrpeple.repository.userrepository;
import com.example.projectregistrpeple.domain.User;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserRepositoryClass implements UserRepositoryInterface {

    private final SessionFactory sessionFactory;


    @Override
    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        session.getSession().save(user);
    }



}
