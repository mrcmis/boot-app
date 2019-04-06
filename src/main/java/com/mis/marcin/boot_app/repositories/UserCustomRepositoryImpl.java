package com.mis.marcin.boot_app.repositories;

import com.mis.marcin.boot_app.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;


@Repository
@Transactional
public class UserCustomRepositoryImpl implements UserCustomRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User findByUsername(String username) {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u where u.username LIKE :username", User.class);
        query.setParameter("username", username);
        try {
            User user = query.getSingleResult();
            return user;
        } catch (Exception e){
            return null;
        }
    }
}
