package com.codegym.casestudy.dao;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.codegym.casestudy.model.user.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RoleDao {

    @Autowired
    private EntityManager entityManager;

    public List<String> getRoleNames(Long userId) {
        String sql = "Select ur.Role.Name from " + Role.class.getName() + " ur " //
                + " where ur.User.userId = :userId ";

        Query query = this.entityManager.createQuery(sql, String.class);
        query.setParameter("userId", userId);
        return query.getResultList();
    }
}
