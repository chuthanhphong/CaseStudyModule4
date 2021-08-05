package com.codegym.casestudy.dao;

import com.codegym.casestudy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class UserDao {

    @Autowired
    private EntityManager entityManager;

    public User findUserAccount(String userName) {
        try {
            String sql = "Select e from " + User.class.getName() + " e " //
                    + " Where e.userName = :userName ";

            Query query = entityManager.createQuery(sql, User.class);
            query.setParameter("userName", userName);

            return (User) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
